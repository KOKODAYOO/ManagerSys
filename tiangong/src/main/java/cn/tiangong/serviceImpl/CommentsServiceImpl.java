package cn.tiangong.serviceImpl;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiangong.dao.TbCommentsMapper;
import cn.tiangong.entity.TbComments;
import cn.tiangong.entity.TbCommentsExample;
import cn.tiangong.service.CommentsService;
import cn.tiangong.tool.Msg;
import cn.tiangong.vo.CommentVo;
@Service
public class CommentsServiceImpl implements CommentsService {
	
	@Autowired
	private TbCommentsMapper commentMapper;

	@Override
	public Msg comment(TbComments comments) {
		commentMapper.insertSelective(comments);
		return Msg.success();
	}

	@Override
	public Msg getCommentsById(int type, int id) {
		List<Map<String, Object>> list = commentMapper.getComments(type, id);
		Map<Integer, Object> resultMap = new HashMap<Integer, Object>();
		for (Map<String, Object> map : list) {
			if((Integer)map.get("parent_id")==null&&(boolean)map.get("isdelete")==false) {
				CommentVo commentVo = (CommentVo) resultMap.get(map.get("id"));
				if(commentVo==null) {
					commentVo = new CommentVo();
					commentVo.setAvatat_url((String)map.get("avatar_url"));
					commentVo.setContent((String)map.get("content"));
					commentVo.setId((int)map.get("id"));
					commentVo.setLike_count((int)map.get("like_count"));
					commentVo.setUsername((String)map.get("username"));
					commentVo.setPost_time((Date)map.get("post_time"));
					commentVo.setUser_id((int)map.get("user_id"));
					commentVo.setList(new Vector<Object>());
				}
				resultMap.put(commentVo.getId(), commentVo);
			}
		}
		
		for (Map<String, Object> map : list) {
			if((Integer)map.get("parent_id")!=null&&(boolean)map.get("isdelete")==false){
				CommentVo commentVo = (CommentVo) resultMap.get(map.get("parent_id"));
				if (commentVo==null) {
					continue;
				}
				commentVo.getList().add(map);
				resultMap.put(commentVo.getId(), commentVo);
			}
		}
		return Msg.success().add("list",resultMap.values());    
	}

	@Override
	public Msg reportComment(int id, int type) {
		TbComments comments=new TbComments();
		comments.setStatus(true);
		comments.setId(id);
		comments.setType(type);
		commentMapper.updateByPrimaryKeySelective(comments);
		return Msg.success();
	}

}
