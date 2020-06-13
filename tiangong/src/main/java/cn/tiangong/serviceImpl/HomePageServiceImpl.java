package cn.tiangong.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tiangong.dao.ArticleMapper;
import cn.tiangong.dao.VideoMapper;
import cn.tiangong.entity.Article;
import cn.tiangong.entity.ArticleExample;
import cn.tiangong.entity.Video;
import cn.tiangong.entity.VideoExample;
import cn.tiangong.service.HomePageService;
import cn.tiangong.tool.Msg;

@Service
public class HomePageServiceImpl implements HomePageService{
	
	@Autowired
	private ArticleMapper articles;
	
	@Autowired
	private VideoMapper videos;

	@Override
	public Msg recommendArticles() {
		ArticleExample articleExample = new ArticleExample();
		articleExample.setOrderByClause("click_count desc");
		PageHelper.startPage(1, 4);
		List<Article> list = articles.selectByExample(articleExample);
		PageInfo<Article> pages = new PageInfo<Article>(list, 4);
		return Msg.success().add("list", pages.getList());
	}

	@Override
	public Msg latestVideo(Integer page) {
		VideoExample articleExample = new VideoExample();
		articleExample.setOrderByClause("release_time desc");
		PageHelper.startPage(1, 4);
		List<Video> list = videos.selectByExample(articleExample);
		PageInfo<Video> pages = new PageInfo<Video>(list, 4);
		return Msg.success().add("list", pages.getList());
	}

}
