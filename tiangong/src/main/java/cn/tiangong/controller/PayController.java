package cn.tiangong.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.entity.CoursePay;
import cn.tiangong.service.PayService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/pay")
@ResponseBody
public class PayController {
	@Autowired
	private PayService payService;
	
	@PostMapping("/removeAdv")
	public Msg removeAdv(int id,int month) {
		return payService.removeAdv(id,month);
	}
	
	@PostMapping("/buyCourse")
	public Msg buyCourse(CoursePay coursePay) {
		return payService.buyCourse(coursePay);
	}
	
	@PutMapping("/recharge")
	public Msg recharge(Integer id,BigDecimal money) {
		return payService.recharge(id,money);
	}
}
