package cn.tiangong.vo;

import java.util.List;


public class EntriesVo {
	private Integer entries_id;
	private String name;
	private String type;
	private Integer now_version;
	public Integer getNow_version() {
		return now_version;
	}
	public void setNow_version(Integer now_version) {
		this.now_version = now_version;
	}
	private List<Integer> list;
	public Integer getEntries_id() {
		return entries_id;
	}
	public void setEntries_id(Integer entries_id) {
		this.entries_id = entries_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	
}
