package cn.tiangong.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tiangong.dao.AnnounceMapper;
import cn.tiangong.entity.Announce;
import cn.tiangong.entity.AnnounceExample;
import cn.tiangong.service.AnnounceService;
import cn.tiangong.tool.Msg;

@Service
public class AnnounceServiceImpl implements AnnounceService {
	@Autowired
	private AnnounceMapper announceMapper;
	

	@Override
	public Msg post(Announce announce) {
		announceMapper.insertSelective(announce);
		return Msg.success();
	}

	@Override
	public Msg getAnnounce(int page) {
		AnnounceExample announceExample = new AnnounceExample();
		announceExample.setOrderByClause("post_time desc");
		announceExample.or().andIsdeleteEqualTo(false);
		PageHelper.startPage(page, 8);
		List<Announce> list = announceMapper.selectByExample(announceExample);
		PageInfo<Announce> pages = new PageInfo<Announce>(list, 8);
		
		return Msg.success().add("list", pages);
	}

	@Override
	public Msg deleteAnnounce(int id) {
		Announce announce = new Announce();
		announce.setId(id);
		announce.setIsdelete(true);
		announceMapper.updateByPrimaryKeySelective(announce);
		return Msg.success();
	}

	@Override
	public Msg modify(Announce announce) {
		announceMapper.updateByPrimaryKeySelective(announce);
		return Msg.success();
	}

}
