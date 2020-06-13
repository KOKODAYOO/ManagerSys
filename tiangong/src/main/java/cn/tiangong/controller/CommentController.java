package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.entity.TbComments;
import cn.tiangong.service.CommentsService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/comments")
@ResponseBody
public class CommentController {
	@Autowired
	private CommentsService commentsService;
	
	@PostMapping("/comment")
	public Msg comment(TbComments comments) {
		return commentsService.comment(comments);
	}
	
	@GetMapping("/getCommentsById")
	public Msg getCommentsById(int type,int id) {
		return commentsService.getCommentsById(type, id);
	}
	
	@PutMapping("/report")
	public Msg reportComments(int type,int id) {
		return commentsService.reportComment(id, type);
	}
}
