package cn.tiangong.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.entity.Dynamics;
import cn.tiangong.tool.Msg;

public interface DynamicsService {
	public Msg postDynamics(int id,String content,MultipartFile[] files,HttpServletRequest request);
	public Msg getAllDynamics(int id);
	public Msg getMyDynamics(int id);
	public Msg deleteDynamics(int id);
}
