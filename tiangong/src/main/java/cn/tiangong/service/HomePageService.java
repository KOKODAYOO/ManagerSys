package cn.tiangong.service;

import cn.tiangong.tool.Msg;

public interface HomePageService {
	public Msg recommendArticles();
	public Msg latestVideo(Integer page);
}
