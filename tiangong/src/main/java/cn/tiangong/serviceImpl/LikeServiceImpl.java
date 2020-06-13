package cn.tiangong.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiangong.dao.ArticleMapper;
import cn.tiangong.dao.CourseMapper;
import cn.tiangong.dao.DynamicsMapper;
import cn.tiangong.dao.LikeMapper;
import cn.tiangong.dao.VideoMapper;
import cn.tiangong.entity.Like;
import cn.tiangong.entity.LikeExample;
import cn.tiangong.entity.Video;
import cn.tiangong.service.LikeService;
import cn.tiangong.tool.Msg;

@Service
public class LikeServiceImpl implements LikeService {
	
	@Autowired
	private LikeMapper likeMapper;
	
	@Autowired
	private VideoMapper videoMapper;
	
	@Autowired 
	private CourseMapper courseMapper;
	
	@Autowired
	private ArticleMapper articleMapper;
	
	@Autowired
	private DynamicsMapper dynamicsMapper;
	
	@Override
	public Msg videoLike(boolean islike,int id,int user_id) {
		Like like = new Like();
		like.setId(id);
		like.setUser_id(user_id);
		like.setType(1);
		LikeExample likeExample = new LikeExample();
		likeExample.or().andIdEqualTo(like.getId()).andTypeEqualTo(like.getType()).andUser_idEqualTo(like.getUser_id());
		if(islike) {
			if(!likeMapper.selectByExample(likeExample).isEmpty()) return Msg.error(400, "已点赞");
			likeMapper.insertSelective(like);
			videoMapper.like(like.getId());
		}else {

			likeMapper.deleteByExample(likeExample);
			videoMapper.dislike(like.getId());
		}
		
		return Msg.success();
	}

	@Override
	public Msg articleLike(boolean islike,int id,int user_id) {
		Like like = new Like();
		like.setId(id);
		like.setUser_id(user_id);
		like.setType(2);
		LikeExample likeExample = new LikeExample();
		likeExample.or().andIdEqualTo(like.getId()).andTypeEqualTo(like.getType()).andUser_idEqualTo(like.getUser_id());
		if(islike) {
			if(!likeMapper.selectByExample(likeExample).isEmpty()) return Msg.error(400, "已点赞");
			likeMapper.insertSelective(like);
			articleMapper.like(like.getId());
		}else {

			likeMapper.deleteByExample(likeExample);
			articleMapper.dislike(like.getId());
		}
		return Msg.success();
	}

	@Override
	public Msg courseLike(boolean islike,int id,int user_id) {
		Like like = new Like();
		like.setId(id);
		like.setUser_id(user_id);
		like.setType(3);
		LikeExample likeExample = new LikeExample();
		likeExample.or().andIdEqualTo(like.getId()).andTypeEqualTo(like.getType()).andUser_idEqualTo(like.getUser_id());
		if(islike) {
			if(!likeMapper.selectByExample(likeExample).isEmpty()) return Msg.error(400, "已点赞");
			likeMapper.insertSelective(like);
			courseMapper.like(like.getId());
		}else {

			likeMapper.deleteByExample(likeExample);
			courseMapper.dislike(like.getId());
		}
		return Msg.success();
	}

	@Override
	public Msg dynamicLike(boolean islike,int id,int user_id) {
		Like like = new Like();
		like.setId(id);
		like.setUser_id(user_id);
		like.setType(4);
		LikeExample likeExample = new LikeExample();
		likeExample.or().andIdEqualTo(like.getId()).andTypeEqualTo(like.getType()).andUser_idEqualTo(like.getUser_id());
		if(islike) {
			if(!likeMapper.selectByExample(likeExample).isEmpty()) return Msg.error(400, "已点赞");
			likeMapper.insertSelective(like);
			dynamicsMapper.like(like.getId());
		}else {

			likeMapper.deleteByExample(likeExample);
			dynamicsMapper.dislike(like.getId());
		}
		return Msg.success();
	}

}
