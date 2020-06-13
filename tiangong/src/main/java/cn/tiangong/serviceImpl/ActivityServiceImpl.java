package cn.tiangong.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tiangong.dao.ActivityMapper;
import cn.tiangong.dao.ActivityMembersMapper;
import cn.tiangong.dao.ActivityPictureMapper;
import cn.tiangong.entity.Activity;
import cn.tiangong.entity.ActivityExample;
import cn.tiangong.entity.ActivityMembers;
import cn.tiangong.entity.ActivityMembersExample;
import cn.tiangong.entity.ActivityPicture;
import cn.tiangong.entity.ActivityPictureExample;
import cn.tiangong.entity.TbUser;
import cn.tiangong.service.ActivityService;
import cn.tiangong.tool.FileUploadUtils;
import cn.tiangong.tool.Msg;
import cn.tiangong.vo.activityVo;



@Service
public class ActivityServiceImpl implements ActivityService {
	@Autowired
	private ActivityMapper activityMapper;
	
	@Autowired
	private ActivityMembersMapper member;
	
	@Autowired
	private ActivityPictureMapper picture;
	
	@Override
	public Msg getActivities(Integer page) {
		try {
			
			ActivityExample activityExample = new ActivityExample();
			activityExample.or().andIs_finishEqualTo(false);
			PageHelper.startPage(page, 8);
			List<Activity> activities=activityMapper.selectByExample(activityExample);	
			
			PageInfo<Activity> pages = new PageInfo<Activity>(activities, 8);
			if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
			return Msg.success().add("pageInfo", pages);
		} catch (Exception e) {
			return Msg.fail();
		}
	}

	@Override
	public Msg newActivity(Activity activity,MultipartFile[] files,HttpServletRequest request) {
		
		try {
			activityMapper.insertSelective(activity);
			int id=activity.getId();
			
			String path=null;
			for (MultipartFile multipartFile : files) {
				 path=FileUploadUtils.fileUpload(multipartFile, request, "activity");
				  if(path!=null) { ActivityPicture activityPicture= new ActivityPicture();
				  activityPicture.setActivity_id(id);
				  activityPicture.setUrl(path);
				  picture.insertSelective(activityPicture); } }
			
			return Msg.success();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return Msg.fail();
		}
		
	}

	@Override
	public Msg joinActivity(ActivityMembers activityMembers) {
		
		try {
			ActivityMembersExample activityMembersExample = new ActivityMembersExample();
			activityMembersExample.or().andIdEqualTo(activityMembers.getId()).andMember_idEqualTo(activityMembers.getMember_id());
			if(!member.selectByExample(activityMembersExample).isEmpty()) return Msg.fail("已经存在");
			member.insertSelective(activityMembers);
			return Msg.success();
			
		} catch (Exception e) {
			return Msg.fail();
		}
	}

	@Override
	public Msg getMembers(int id) {

		try {
			List<TbUser> list = member.getUserListByActivity(id);
			return Msg.success().add("members", list);
		} catch (Exception e) {
			return Msg.fail();
		}
		
		
	}

	@Override
	public void updateTime() {
		activityMapper.updateTime();
		
	}

	@Override
	public Msg getActById(int id) {
		Activity a=activityMapper.selectByPrimaryKey(id);
		activityVo vo = new activityVo();
		vo.setContent(a.getContent());
		vo.setCover_url(a.getCover_url());
		vo.setId(a.getId());
		vo.setIs_finish(a.getIs_finish());
		vo.setName(a.getName());
		vo.setTime(a.getTime());
		vo.setUser_id(a.getUser_id());
		ActivityPictureExample example= new ActivityPictureExample();
		example.or().andActivity_idEqualTo(a.getId());
		List<ActivityPicture> li = picture.selectByExample(example);
		vo.setPictures(li);
		return Msg.success().add("activity", vo);
	}
	

	
}
