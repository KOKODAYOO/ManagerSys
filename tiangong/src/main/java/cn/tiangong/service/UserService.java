package cn.tiangong.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.entity.TbUser;
import cn.tiangong.tool.Msg;
import cn.tiangong.vo.introductionVo;

public interface UserService {
	public Msg register(TbUser tbUser);
	public Msg login(String username,String phone,String password);
	public Msg uploadUserInfo(TbUser tbUser);
	public Msg identifyArtist(MultipartFile[] files,Integer user_id,HttpServletRequest request,MultipartFile video,String notes);
	public Msg historyList(int id);
	public Msg report(int id);
	public Msg getInfo(int id);
}
