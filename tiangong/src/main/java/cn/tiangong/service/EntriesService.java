package cn.tiangong.service;


import cn.tiangong.entity.Entries;
import cn.tiangong.entity.Introduction;
import cn.tiangong.entity.Types;
import cn.tiangong.tool.Msg;

public interface EntriesService {
	public Msg newEntries(Entries entries);
	public Msg showEntries(Integer page);
	public Msg showList(int page);
	public Msg viewEntries(int id);
	public Msg newIntroduction(Introduction introduction);
	public Msg modifyEntries(Introduction introduction);
	public Msg delete(Integer id);
	public Msg changeVersion(int id,int entries,int version);
	public Msg showEntriesVo(Integer page);
	public Msg showVersionList(int id,int page);
	public Msg showVersionListWithAva(int id,int page);
	public Msg typeList();
	public Msg newType(Types types);
}
