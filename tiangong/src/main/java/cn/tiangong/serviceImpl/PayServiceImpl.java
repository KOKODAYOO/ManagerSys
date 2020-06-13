package cn.tiangong.serviceImpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiangong.dao.CoursePayMapper;
import cn.tiangong.dao.TbUserMapper;
import cn.tiangong.entity.CoursePay;
import cn.tiangong.entity.CoursePayExample;
import cn.tiangong.entity.TbUser;
import cn.tiangong.entity.TbUserExample;
import cn.tiangong.service.PayService;
import cn.tiangong.tool.Msg;

@Service
public class PayServiceImpl implements PayService {
	
	@Autowired
	private TbUserMapper user;
	
	@Autowired
	private CoursePayMapper pay;

	@Override
	public Msg buyCourse(CoursePay coursePay) {
		pay.insertSelective(coursePay);
		return Msg.success();
	}

	@Override
	public Msg removeAdv(int id,int month) {
		TbUser u=user.selectByPrimaryKey(id);
		TimeZone timeZone =TimeZone.getTimeZone("ETC/GMT-8");
		TimeZone.setDefault(timeZone);
		Date time = u.getNoAdv_time();
		Date now = new Date();
		if(time.compareTo(now)>=0) {
			time.setTime(time.getTime()+1000*60*60*24*30*month);
		}else {
			time.setTime(now.getTime()+1000*60*60*24*30*month);
		}
		u.setNoAdv_time(time);
		user.updateByPrimaryKeySelective(u);
		return Msg.success();
	}

	@Override
	public Msg recharge(Integer id,BigDecimal money) {
		user.recharge(id, money);
		return Msg.success();
	}

	@Override
	public Msg myCourses(int id) {

		List<Map<String, Object>> list = pay.myCourses(id);
		return Msg.success().add("list", list);
	}

}
