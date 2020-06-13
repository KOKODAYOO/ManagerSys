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

import cn.tiangong.entity.Entries;
import cn.tiangong.entity.Introduction;
import cn.tiangong.entity.Types;
import cn.tiangong.service.EntriesService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/show")
@ResponseBody
public class EntriesController {
	@Autowired
	private EntriesService entriesService;
	
	
	/**
	 * 创建词条
	 * @param entries
	 * @return
	 */
	@PostMapping("/newEntries")
	public Msg newEntries(Entries entries) {
		return entriesService.newEntries(entries);
	}
	
	/*
	 * 创建百科
	 */
	
	@PostMapping("/newIntroduction")
	public Msg newIntroduction(Introduction introduction) {
		return entriesService.newIntroduction(introduction);
	}
	
	/**
	 * 最新词条
	 * @return
	 */
	
	@GetMapping("/latestEntries")
	public Msg latestEntries(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return entriesService.showList(page);
	}
/**
 * 查看词条
 * @param id
 * @return
 */
	@GetMapping("/viewEntries")
	public Msg viewEntries(int id) {
		return entriesService.viewEntries(id);
	}
	/**
	 * 修改词条
	 * @param introduction
	 * @return
	 */
	@PostMapping("/modifyEntries")
	public Msg modifyEntries(Introduction introduction) {
		return entriesService.modifyEntries(introduction);
	}
	/**
	 * 展示全部词条
	 * @return
	 */
	@GetMapping("/showEntries")
	public Msg showEntries(@RequestParam(value = "page", defaultValue = "1")  Integer page) {
		return entriesService.showEntries(page);
	}
	
	@DeleteMapping("/delete")
	public Msg delete(Integer id) {
		return entriesService.delete(id);
	}
	
	@GetMapping("/showEntriesVo")
	public Msg showEntriesVo(@RequestParam(value = "page", defaultValue = "1")  Integer page) {
		return entriesService.showEntriesVo(page);
	}
	
	@GetMapping("/showVersionList")
	public Msg showVersionList(Integer id,
			@RequestParam(value = "page", defaultValue = "1")  Integer page) {
		return entriesService.showVersionList(id,page);
	}
	
	@PutMapping("/changeVersion")
	public Msg changeVersion(Integer id,Integer entries,Integer version) {
		return entriesService.changeVersion(id,entries, version);
	}
	
	@GetMapping("/typeList")
	public Msg typeList() {
		return entriesService.typeList();
	}
	
	@PostMapping("/newTypes")
	public Msg newType(Types types) {
		return entriesService.newType(types);
	}
	
	@GetMapping("/showVersionListWithAva")
	public Msg 	showVersionListWithAva(Integer id,
			@RequestParam(value = "page", defaultValue = "1")  Integer page) {
		return entriesService.showVersionListWithAva(id, page);
	}
}
