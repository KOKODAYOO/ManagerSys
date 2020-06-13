package cn.tiangong.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tiangong.dao.EntriesMapper;
import cn.tiangong.dao.IntroductionMapper;
import cn.tiangong.dao.TypesMapper;
import cn.tiangong.entity.Entries;
import cn.tiangong.entity.EntriesExample;
import cn.tiangong.entity.Introduction;
import cn.tiangong.entity.IntroductionExample;
import cn.tiangong.entity.Types;
import cn.tiangong.entity.TypesExample;
import cn.tiangong.entity.Video;
import cn.tiangong.service.EntriesService;
import cn.tiangong.tool.Msg;
import cn.tiangong.vo.EntriesVo;

@Service
public class EntriesServiceImpl implements EntriesService {

	@Autowired
	private EntriesMapper entriesMapper;
	
	@Autowired
	private TypesMapper typesMapper;
	
	@Autowired
	private IntroductionMapper introductionMapper;
	
	//
	@Override
	public Msg newEntries(Entries entries) {
		entriesMapper.insertSelective(entries);
		return Msg.success();
	}

	
	//最新百科列表
	@Override
	public Msg showList(int page) {
		PageHelper.startPage(page, 8);
		List<Map<String, Object>> list=entriesMapper.getList();
		PageInfo<Map<String, Object>> pages = new PageInfo<Map<String, Object>>(list, 8);
		return Msg.success().add("introduction",pages );
	}
	//
	@Override
	public Msg viewEntries(int id) {
		entriesMapper.view(id);
		return Msg.success().add("introduction", introductionMapper.selectByPrimaryKey(id));
	}
	
//
	@Override
	public Msg newIntroduction(Introduction introduction) {
		introduction.setVersion(1);
		introduction.setIs_used(true);
		introduction.setReason("创建");
		introductionMapper.insertSelective(introduction);
		return Msg.success();
	}
//
	@Override
	public Msg modifyEntries(Introduction introduction) {
		introductionMapper.insertSelective(introduction);
		return Msg.success();
	}
//
	@Override
	public Msg showEntries(Integer page) {
		EntriesExample entriesExample = new EntriesExample();
		entriesExample.setOrderByClause("name asc");
		PageHelper.startPage(page, 8);
		List<Entries> list = entriesMapper.selectByExample(entriesExample);
		PageInfo<Entries> pages = new PageInfo<Entries>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo",pages);
	}


	@Override
	public Msg delete(Integer id) {
		IntroductionExample introductionExample = new IntroductionExample();
		introductionExample.or().andEntries_idEqualTo(id);
		introductionMapper.deleteByExample(introductionExample);
		entriesMapper.deleteByPrimaryKey(id);
		return Msg.success();
	}


	@Override
	public Msg changeVersion(int id,int entries,int version) {
		Introduction introduction=new Introduction();
		introductionMapper.clearVersion(entries);
		introduction.setIs_used(true); 
		introduction.setVersion(version);
		introduction.setId(id);
		introduction.setEntries_id(entries);;
		introductionMapper.updateByPrimaryKeySelective(introduction);
		return Msg.success();
	}


	@Override
	public Msg showVersionList(int id,int page) {
		IntroductionExample introductionExample = new IntroductionExample();
		introductionExample.or().andEntries_idEqualTo(id);
		PageHelper.startPage(page, 8);
		List<Introduction> list = introductionMapper.selectByExample(introductionExample);
		PageInfo<Introduction> pages = new PageInfo<Introduction>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo",pages);
	}


	@Override
	public Msg showEntriesVo(Integer page) {
		PageHelper.startPage(page, 8);
		List<Map<String, Object>> list=entriesMapper.getIntros();
		
		PageInfo<Map<String, Object>> pages = new PageInfo<Map<String, Object>>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo",pages);
	}


	@Override
	public Msg typeList() {
		TypesExample typesExample = new TypesExample();
		return Msg.success().add("list", typesMapper.selectByExample(typesExample));
	}


	@Override
	public Msg newType(Types types) {
		typesMapper.insert(types);
		return Msg.success();
	}


	@Override
	public Msg showVersionListWithAva(int id, int page) {
		PageHelper.startPage(page, 8);
		List<Map<String, Object>> list= introductionMapper.getVersionListWithAva(id);
		PageInfo<Map<String, Object>> pages = new PageInfo<Map<String, Object>>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo",pages);
	}
	

	
}
