package kr.co.itcen.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//RequestMapping Method 단독매핑
@Controller
public class UserController {
	
	@ResponseBody
	@RequestMapping(value = "/user/join", method=RequestMethod.POST)
	public String joinForm() {
		return "UserController:joinForm";
	}
	
	@RequestMapping(value = "/user/join", method=RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/user/joinform", method=RequestMethod.POST)
	public String join(User user) {
		System.out.println("데이터가 잘 들어 오나?");
		// UserDao.Insert(user);
		return "redirect:/hello";
		//return "/WEB-INF/views/joinform.jsp";
	}
}
