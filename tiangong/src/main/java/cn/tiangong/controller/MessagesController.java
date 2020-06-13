package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.entity.Messages;
import cn.tiangong.service.MessageService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/communicate")
@ResponseBody
public class MessagesController {

		@Autowired
		private MessageService messagesService;
		
		@PostMapping("/call")
		public Msg call(Messages message) {
			return messagesService.call(message);
		}
		
		@DeleteMapping("deleteMessage")
		public Msg delete(int id) {
			return messagesService.deleteMeaasge(id);
		}
		
		@GetMapping("getMessagesList")
		public Msg getMessagesList(int user_id) {
			return messagesService.getMessagesList(user_id);
		}
}
