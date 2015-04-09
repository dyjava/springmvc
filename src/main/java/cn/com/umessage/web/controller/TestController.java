package cn.com.umessage.web.controller;

import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
@RequestMapping("/home")  
public class TestController {
	
	//http://dyong:8180/tel/home/index.do
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		Hashtable<String,String> table = new Hashtable<String,String>() ;
		table.put("name", "dyong") ;
		table.put("password", "qwer") ;
		return new ModelAndView("index", "user", table) ;
    }  
}
