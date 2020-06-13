package cn.tiangong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tiangong.entity.Admin;
import cn.tiangong.service.AdminService;
import cn.tiangong.tool.Msg;
/**
 * 管理员端基本功能
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin")
public class adminController  {
	@Autowired
	private AdminService adminService;
	
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
    @RequestMapping("/login")
    public String checkLogin(Admin admin,Model model){
        admin = adminService.checkLogin(admin.getName(), admin.getPassword());

        if(admin != null){
            model.addAttribute("admin",admin);
            return  "index";
        }
        return "login";
    }
    
	@RequestMapping("/getAdminList")
	@ResponseBody
	public Msg getEmpsWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 10);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Admin> admins = adminService.getAdmins();
		//System.out.println(admins);
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<Admin> page = new PageInfo<Admin>(admins, 10);
		
		return Msg.success().add("pageInfo", page);
	}
    
	
	@PostMapping("/addAdmin")
	@ResponseBody
	public Msg addAdmin(Admin admin) {
		return adminService.addAdmin(admin);
	}
	
	@DeleteMapping("/deleteAdmin")
	@ResponseBody
	@CrossOrigin(maxAge=3600)
	public Msg deletedmin(int id) {
		return adminService.deleteAdmin(id);
	}
	
	@GetMapping("/check")
	@ResponseBody
	public Msg check(String account) {
		return adminService.check(account);
	}
}
