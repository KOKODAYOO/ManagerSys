package cn.tiangong.serviceImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiangong.dao.AdminMapper;
import cn.tiangong.entity.Admin;
import cn.tiangong.entity.AdminExample;
import cn.tiangong.service.AdminService;
import cn.tiangong.tool.Msg;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	
	public AdminMapper getAdminMapper() {
		return adminMapper;
	}

	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}

	@Override
	public Admin checkLogin(String name, String password) {
		AdminExample adminExample=new AdminExample();
		adminExample.or().andNameEqualTo(name).andPasswordEqualTo(password);
		List<Admin> admins=adminMapper.selectByExample(adminExample);
        if(admins != null ){
            
            return admins.get(0);
        }
        return null;
	}

	@Override
	public List<Admin> getAdmins() {
		AdminExample adminExample= new AdminExample();
		adminExample.or().andIsdeleteEqualTo(false);
		return adminMapper.selectByExample(adminExample);
	}

	@Override
	public Msg deleteAdmin(int id) {
		Admin admin = new Admin();
		admin.setId(id);
		admin.setIsdelete(true);
		adminMapper.updateByPrimaryKeySelective(admin);
		return Msg.success();
	}

	@Override
	public Msg addAdmin(Admin admin) {
		adminMapper.insertSelective(admin);
		return Msg.success();
	}

	@Override
	public Msg check(String account) {
		AdminExample adminExample = new AdminExample();
		adminExample.or().andNameEqualTo(account);
		List<Admin> list =adminMapper.selectByExample(adminExample);
		if(list.isEmpty()) return Msg.success();
		
		return Msg.fail();
	}
	
}
