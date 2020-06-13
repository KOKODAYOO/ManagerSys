package cn.tiangong.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiangong.dao.CollectionsMapper;
import cn.tiangong.entity.Collections;
import cn.tiangong.entity.CollectionsExample;
import cn.tiangong.service.CollectionService;
import cn.tiangong.tool.Msg;

@Service
public class CollectionServiceimpl implements CollectionService {
	@Autowired
	private CollectionsMapper collectionsMapper;

	@Override
	public Msg myFavor(int id) {	
		return Msg.success().add("article", collectionsMapper.myFavor(id))
				.add("video", collectionsMapper.myFavorVideo(id))
				.add("course", collectionsMapper.myFavorCourse(id));
	}

	@Override
	public Msg favorById(Collections collection) {
		collectionsMapper.insertSelective(collection);
		return Msg.success();
	}

	@Override
	public Msg deleteById(Collections collection) {
		CollectionsExample collectionsExample = new CollectionsExample();
		collectionsExample.or().andItem_idEqualTo(collection.getItem_id()).andUser_idEqualTo(collection.getUser_id()).andTypeEqualTo(collection.getType());
		collectionsMapper.deleteByExample(collectionsExample);
		return Msg.success();
	}
	
	
	
}
