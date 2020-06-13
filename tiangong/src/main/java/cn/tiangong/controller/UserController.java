package cn.tiangong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.entity.Identifyartist;
import cn.tiangong.entity.TbUser;
import cn.tiangong.service.UserService;
import cn.tiangong.tool.Msg;
/**
 * 用户基本功能
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController  {
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public Msg checkLogin(@RequestParam(value="account") String username,
    		@RequestParam(value="account") String phone,
    		@RequestParam(value="password") String password){
        return userService.login(username,phone,password);
    }
    
    @RequestMapping(value="/register",method=RequestMethod.POST)
    public Msg register(TbUser user) {
    	
        return userService.register(user);
    }
    
    @RequestMapping(value="uploadUserInfo",method=RequestMethod.PUT)
    public Msg uploadUserInfo(@RequestParam(value="id",required=true) Integer id,
    		@RequestParam(value="avatar_url",required=false) String avatar_url,
    		@RequestParam(value="gender",required=false) Integer gender,
    		@RequestParam(value="e_mail",required=false) String e_mail,
    		@RequestParam(value="phone",required=false) String phone,
    		@RequestParam(value="province",required=false) String province,
    		@RequestParam(value="city",required=false) String city,
    		@RequestParam(value="username",required=false) String username,
    		@RequestParam(value="motto",required=false) String motto
    		) {
    	TbUser tbUser = new TbUser();
    	tbUser.setId(id);
    	tbUser.setAvatar_url(avatar_url);;
    	if (gender==null);
    	else if(gender==1) tbUser.setGender(true);
    	else if(gender==0) tbUser.setGender(false);
    	tbUser.setE_mail(e_mail);;
    	tbUser.setPhone(phone);
    	tbUser.setProvince(province);
    	tbUser.setCity(city);
    	tbUser.setUsername(username);
    	tbUser.setMtto(motto);
    	System.out.println(e_mail);
    	return userService.uploadUserInfo(tbUser);
    }
    
    @PostMapping("/identify")
    public Msg Identifyartist(@RequestParam(value="files",required=false) MultipartFile[] files,
    		@RequestParam(value="video",required=false) MultipartFile video,
    		@RequestParam(value="id") Integer user_id,
    		@RequestParam(value="text",required=false) String notes,
    		HttpServletRequest request) {
    	return userService.identifyArtist(files, user_id,request,video,notes);
    }
    
    @GetMapping("/history")
    public Msg getHistory(@RequestParam(value="id") Integer id) {
    	return userService.historyList(id);
    }
    
    @GetMapping("/test")
    public Msg test() {
        return Msg.success();
    }
    
    @DeleteMapping("/test")
    public Msg testDe() {
    	return Msg.success();
    }
    
    @PutMapping("/report")
    public Msg report(int id) {
    	return userService.report(id);
    }
    
    @GetMapping("/getInfo")
    public Msg getInfo(@RequestParam(value="id") Integer id) {
    	return userService.getInfo(id);
    }
}
