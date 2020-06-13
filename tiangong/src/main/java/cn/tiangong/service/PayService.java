package cn.tiangong.service;

import java.math.BigDecimal;

import cn.tiangong.entity.CoursePay;
import cn.tiangong.tool.Msg;

public interface PayService {
	public Msg buyCourse(CoursePay coursePay);
	public Msg removeAdv(int id,int month);
	public Msg recharge(Integer id,BigDecimal money);
	public Msg myCourses(int id);
}
