package cn.tiangong.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.dao.ArticleMapper;
import cn.tiangong.dao.CourseMapper;
import cn.tiangong.dao.HistoryMapper;
import cn.tiangong.dao.IdentifyartistMapper;
import cn.tiangong.dao.IdentifymaterialMapper;
import cn.tiangong.dao.TbUserMapper;
import cn.tiangong.dao.VideoMapper;
import cn.tiangong.entity.History;
import cn.tiangong.entity.HistoryExample;
import cn.tiangong.entity.Identifyartist;
import cn.tiangong.entity.IdentifyartistExample;
import cn.tiangong.entity.Identifymaterial;
import cn.tiangong.entity.TbUser;
import cn.tiangong.entity.TbUserExample;
import cn.tiangong.entity.Video;
import cn.tiangong.service.UserService;
import cn.tiangong.tool.FileUploadUtils;
import cn.tiangong.tool.Msg;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private TbUserMapper tbUserMapper;
	
	@Autowired
	private IdentifyartistMapper identifyartistMapper;
	
	@Autowired
	private IdentifymaterialMapper material;
	
	@Autowired
	private HistoryMapper history;
	
	@Autowired
	private VideoMapper video;
	
	@Autowired
	private ArticleMapper article;
	
	@Autowired
	private CourseMapper course;

	@Override
	public Msg register(TbUser user) {
		try {
			
			  TbUserExample userExample =new TbUserExample();
			  userExample.or().andUsernameEqualTo(user.getUsername()); List<TbUser>
			  users=tbUserMapper.selectByExample(userExample); if(users.size()!=0) { return
			  Msg.fail("用户名已存在"); }
			  
			  userExample.clear(); userExample.or().andPhoneEqualTo(user.getPhone());
			  users=tbUserMapper.selectByExample(userExample); if(users.size()!=0){ return
			  Msg.fail("电话已存在"); }
			 
			 
			//System.out.println(user.toString());
			 tbUserMapper.insertSelective(user);
			 return Msg.success();
		} catch (Exception e) {
			e.printStackTrace();
			return Msg.fail();
		}
		
	}

	@Override
	public Msg login(String username,String phone,String password) {
		try {
			TbUserExample userExample =new TbUserExample();
			userExample.or().andUsernameEqualTo(username).andPasswordEqualTo(password);
			userExample.or().andPhoneEqualTo(phone).andPasswordEqualTo(password);
			List<TbUser> users=tbUserMapper.selectByExample(userExample);
			if(users != null ){
			    
			    return Msg.success().add("user",users.get(0));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return Msg.NotFound("用户名或密码错误").add("id",-1);
		}
		return Msg.fail().add("id",-1);
	}


	@Override
	public Msg uploadUserInfo(TbUser tbUser) {
		
		try {
			tbUserMapper.updateByPrimaryKeySelective(tbUser);
			return Msg.success().add("user", tbUserMapper.selectByPrimaryKey(tbUser.getId()));
		} catch (Exception e) {
			e.printStackTrace();
			return Msg.fail();
		}
		
		
	}

	@Override
	public Msg historyList(int id) {
		List<Map<String, Object>> list = history.getHistory(id);
		
	for (Map<String, Object> map : list) {
		int type=(int)map.get("type");
		if(type==1) {
			map.put("item", article.selectByPrimaryKey((int)map.get("item_id")));
		}
		if (type==2){
			map.put("item", video.selectByPrimaryKey((int)map.get("item_id")));
		}
		if (type==3) {
			map.put("item", course.selectByPrimaryKey((int)map.get("item_id")));
		}
	}
		return Msg.success().add("list", list);
	}

	@Override
	public Msg identifyArtist(MultipartFile[] files, Integer user_id,HttpServletRequest request,MultipartFile video,String notes) {
		Identifyartist artist = new Identifyartist();
		artist.setUser_id(user_id);
		if(video!=null) {
			String videopath=FileUploadUtils.fileUpload(video, request, "identifyvideo");
			artist.setVideo_url(videopath);
		}

		artist.setNotes(notes);
		identifyartistMapper.insertSelective(artist);

		IdentifyartistExample identifyartistExample = new IdentifyartistExample();

		identifyartistExample.or().andUser_idEqualTo(user_id);
		List<Identifyartist> identifyartists=identifyartistMapper.selectByExample(identifyartistExample);
		if(identifyartists.isEmpty()) return Msg.fail();
		int id = identifyartists.get(identifyartists.size()-1).getId();
		String path=null;
		
		
		 for (MultipartFile multipartFile : files) {
		 path=FileUploadUtils.fileUpload(multipartFile, request, "identifyMaterial");
		  if(path!=null) { Identifymaterial identifymaterial =new Identifymaterial();
		 identifymaterial.setId(id); identifymaterial.setContent_url(path);
		  material.insertSelective(identifymaterial); } }
		 
		
		return Msg.success().add("id", id);
	}

	@Override
	public Msg report(int id) {
		TbUser user=new TbUser();
		user.setId(id);
		user.setLevel(9);
		tbUserMapper.updateByPrimaryKeySelective(user);
		return Msg.success();
	}

	@Override
	public Msg getInfo(int id) {
		
		return Msg.success().add("user", tbUserMapper.selectByPrimaryKey(id));
	}

}
