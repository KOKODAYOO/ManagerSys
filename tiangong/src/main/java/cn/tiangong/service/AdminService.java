package cn.tiangong.service;

import java.util.List;

import cn.tiangong.entity.Admin;
import cn.tiangong.tool.Msg;

public interface AdminService {
	  //检验用户登录
	  public Admin checkLogin(String account,String password);
	  public List<Admin> getAdmins();
	  public Msg deleteAdmin(int id);
	  public Msg addAdmin(Admin admin);
	  public Msg check(String account);
}
