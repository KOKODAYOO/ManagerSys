package cn.tiangong.service;

import cn.tiangong.entity.Announce;
import cn.tiangong.tool.Msg;

public interface AnnounceService {
	public Msg post(Announce announce);
	public Msg getAnnounce(int page);
	public Msg deleteAnnounce(int id);
	public Msg modify(Announce announce);
}
