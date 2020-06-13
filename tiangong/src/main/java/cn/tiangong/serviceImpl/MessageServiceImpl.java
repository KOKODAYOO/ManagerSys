package cn.tiangong.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiangong.dao.MessagesMapper;
import cn.tiangong.entity.Messages;
import cn.tiangong.entity.MessagesExample;
import cn.tiangong.service.MessageService;
import cn.tiangong.tool.Msg;
import cn.tiangong.vo.MessageVo;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessagesMapper messages;
	
	@Override
	public Msg getMessagesList(int user_id) {
		
		List<Map<String, Object>> list = messages.getTalkerInfo(user_id);
		Map<Integer,MessageVo> messageMap= new HashMap<Integer, MessageVo>(); 
		for (Map<String, Object> lmap : list) {
			MessageVo messageVo = (MessageVo)messageMap.get(lmap.get("talker"));
			if (messageVo==null) {
				messageVo =new MessageVo();
			if(lmap.get("avatar_url")!=null)
				messageVo.setUrl((String)lmap.get("avatar_url"));
				messageVo.setTalker_id((Integer)lmap.get("talker"));
				messageVo.setTalker_name((String) lmap.get("username"));
				messageVo.setList(new Vector<Object>());
			}
			lmap.remove("talker");
			lmap.remove("username");
			if(lmap.get("avatar_url")!=null) lmap.remove("avatar_url");
			messageVo.getList().add(lmap);
			messageMap.put(messageVo.getTalker_id(), messageVo);

		}
		
		return Msg.success().add("list", messageMap.values());
	}

	@Override
	public Msg call(Messages message) {
		try {
			messages.insertSelective(message);
			
			return Msg.success();
		} catch (Exception e) {
			return Msg.fail();
		}
	}

	@Override
	public Msg deleteMeaasge(int id) {
		try {
			Messages message = new Messages();
			message.setId(id);
			message.setIsdelete(true);
			messages.updateByPrimaryKeySelective(message);
			return Msg.success();
		} catch (Exception e) {
			return Msg.fail();
		}

	}

}
