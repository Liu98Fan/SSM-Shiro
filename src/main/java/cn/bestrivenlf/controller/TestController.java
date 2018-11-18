package cn.bestrivenlf.controller;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bestrivenlf.service.SayHelloService;

@Controller
@RequestMapping("/Test")
public class TestController {
	
	@Autowired
	private SayHelloService sayHelloService;
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return sayHelloService.sayHello();
	}
	
	@RequestMapping("/login")
	public String login(String username,String password) {
		Subject subject = SecurityUtils.getSubject();
		System.out.println("认证开始");
		if(!subject.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username,password);
			try {
				subject.login(token);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("fail authentication");
			}
			
		}
		return "index";
	}
	@RequestMapping("/user")
	public String user() {
		return "user";
	}
}
