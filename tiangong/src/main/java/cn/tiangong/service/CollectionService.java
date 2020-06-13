package cn.tiangong.service;

import cn.tiangong.entity.Collections;
import cn.tiangong.tool.Msg;

public interface CollectionService {
	public Msg myFavor(int id);
	public Msg favorById(Collections collection);
	public Msg deleteById(Collections collection);
}
