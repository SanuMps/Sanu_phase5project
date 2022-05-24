package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {
	@Autowired
	UserRepo repo;
	RestTemplate rest=new RestTemplate();
	Logger log=Logger.getAnonymousLogger();
	@ResponseBody
	@RequestMapping("login")
	public String checklogin(HttpServletRequest req, HttpServletResponse res) {
		log.info("entered into the login request mapping");
		String username=req.getParameter("un");
		String password=req.getParameter("pwd");
		if(repo.findByName(username)!=null) {
			log.info("verified the credentials matching");
			return "Login is successfull"+"\n"+"Welcome to "+username;
		}
		else {
			log.info("login failed");
			return "check the credentials or register";
		}
	
	}
	
	
	@RequestMapping("register")
	public String microserviceOfregister(HttpServletRequest req, HttpServletResponse res) {
		log.info("entered login microservice register mapping");
		String username=req.getParameter("un");
		String password=req.getParameter("pwd");
		String email=req.getParameter("email");
		String url="http://localhost:8090/register-user/"+username+"/"+password+"/"+email;
		log.info(url);
		rest.getForObject(url,String.class);
		log.info("successfully went to register ms");
		return "success";
	}
	
	

}

