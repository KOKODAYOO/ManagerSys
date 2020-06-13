package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.entity.Announce;
import cn.tiangong.service.AnnounceService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/announce")
@ResponseBody
public class AnnounceController {
	@Autowired
	private AnnounceService announceService;
	
	@GetMapping("/getAnnounce")
	public Msg getAnnounce(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return announceService.getAnnounce(page);
	}
	
	@DeleteMapping("/deleteById")
	public Msg delete(int id) {
		return announceService.deleteAnnounce(id);
	}
	
	@PostMapping("/newAnnounce")
	public Msg post(Announce announce) {
		return announceService.post(announce);
	}
	
	@PutMapping("/modify")
	public Msg modify(Announce announce) {
		return announceService.modify(announce);
	}
}
