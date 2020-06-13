package cn.tiangong.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiangong.dao.FocusMapper;
import cn.tiangong.entity.Focus;
import cn.tiangong.entity.FocusExample;
import cn.tiangong.entity.TbUser;
import cn.tiangong.service.FocusService;
import cn.tiangong.tool.Msg;

@Service
public class FocusServiceImpl implements FocusService {
	
	@Autowired
	private FocusMapper focusMapper;
	
	

	public FocusMapper getFocusMapper() {
		return focusMapper;
	}

	public void setFocusMapper(FocusMapper focusMapper) {
		this.focusMapper = focusMapper;
	}

	@Override
	public Msg focusUser(int user_id, int focus_id) {
		try {
			FocusExample focusExample = new FocusExample();
			focusExample.or().andUser_idEqualTo(user_id).andFocus_idEqualTo(focus_id);
			if(!focusMapper.selectByExample(focusExample).isEmpty()) return Msg.error(409,"已关注");
			
			focusMapper.insert(new Focus(user_id,focus_id));
			focusMapper.focus(user_id);
			focusMapper.focused(focus_id);
			return Msg.success();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return Msg.fail();
		}
	}
	/**
	 * 返回关注列表
	 */
	@Override
	public Msg getFocusList(int user_id) {
		try {
			List<TbUser> list = focusMapper.getFocusListByUserId(user_id);
			return Msg.success().add("focusList", list);
		} catch (Exception e) {
			return Msg.fail();
		}
	}
	/**
	 * 返回被关注列表
	 */
	@Override
	public Msg getFocusedList(int user_id) {
		try {
			List<TbUser> list = focusMapper.getFocusedListByUserId(user_id);
			return Msg.success().add("focusedList", list);
		} catch (Exception e) {
			return Msg.fail();
		}
	}

	@Override
	public Msg deleteFocus(int user_id, int focus_id) {
		try {
			FocusExample focusExample = new FocusExample();
			focusExample.or().andUser_idEqualTo(user_id).andFocus_idEqualTo(focus_id);
			
			if(focusMapper.selectByExample(focusExample).isEmpty()) return Msg.NotFound("未关注");
			
			focusMapper.deleteByExample(focusExample);
			focusMapper.nofocus(user_id);
			focusMapper.nofocused(focus_id);
			return Msg.success();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return Msg.fail();
		}
	}

}
