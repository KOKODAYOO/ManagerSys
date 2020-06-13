package cn.tiangong.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import cn.tiangong.dao.DynamicsMapper;
import cn.tiangong.dao.DynamicsPictureMapper;
import cn.tiangong.entity.Dynamics;
import cn.tiangong.entity.DynamicsPicture;
import cn.tiangong.entity.DynamicsPictureExample;
import cn.tiangong.service.DynamicsService;
import cn.tiangong.tool.FileUploadUtils;
import cn.tiangong.tool.Msg;

@Service
public class DynamicsServiceImpl implements DynamicsService {
	@Autowired
	private DynamicsMapper dynamicsMapper;
	
	@Autowired
	private DynamicsPictureMapper picture;

	//
	@Override
	public Msg postDynamics(int id,String content,MultipartFile[] files,HttpServletRequest request) {
		Dynamics dynamics=new Dynamics();
		dynamics.setUser_id(id);
		dynamics.setContent(content);
		dynamicsMapper.insertSelective(dynamics);
		Integer ID=dynamics.getId();
		
		for (MultipartFile multipartFile : files) {
			String path=FileUploadUtils.fileUpload(multipartFile, request, "dynamics");
			if(path!=null) {
				DynamicsPicture dynamicsPicture =new DynamicsPicture();
				dynamicsPicture.setContent_url(path);
				dynamicsPicture.setId(ID);
				picture.insertSelective(dynamicsPicture);
			}
		}
		
		return Msg.success();
	}

	@Override
	public Msg getAllDynamics(int id) {
		List<Map<String, Object>> list1 = dynamicsMapper.getAll(id);
		List<Map<String, Object>> list2 = dynamicsMapper.getDynamics(id);
		list1.addAll(list2);
		for (Map<String, Object> map : list1) {
			Integer integer=(Integer) map.get("id");
			DynamicsPictureExample dynamicsPictureExample=new DynamicsPictureExample();
			dynamicsPictureExample.or().andIdEqualTo(integer);
			List<DynamicsPicture> pictures=picture.selectByExample(dynamicsPictureExample);
			map.put("picetures", pictures);
		}
		return Msg.success().add("list", list1);
	}

	@Override
	public Msg getMyDynamics(int id) {
		List<Map<String, Object>> list = dynamicsMapper.getDynamics(id);
		for (Map<String, Object> map : list) {
			Integer integer=(Integer) map.get("id");
			DynamicsPictureExample dynamicsPictureExample=new DynamicsPictureExample();
			dynamicsPictureExample.or().andIdEqualTo(integer);
			List<DynamicsPicture> pictures=picture.selectByExample(dynamicsPictureExample);
			map.put("picetures", pictures);
		}
		return Msg.success().add("list", list);
	}
//
	@Override
	public Msg deleteDynamics(int id) {
		dynamicsMapper.deleteByPrimaryKey(id);
		return Msg.success();
	}
	
	
}
