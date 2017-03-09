package org.plasea.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpServletRequest request,HttpServletResponse response) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		Cookie c = new Cookie("homeDefault","huhahai");
		response.addCookie(c);
		
		Cookie c2 = new Cookie("homeDefault","huhahai");
        response.addCookie(c);
		
		
		
		return "home";
	}
	
	@RequestMapping(value = "/visit/#/nginxtest")
	public String niginxTest(){
	    System.out.println("tttttttttttt");
	    return "visit";
	}
	
	@RequestMapping(value = "/setCookie")
    @ResponseBody
	public void setCookie(HttpServletRequest request,HttpServletResponse resp){
	    
	    resp.setHeader("Access-Control-Allow-Origin", "*"); 
        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE"); 
        resp.setHeader("Access-Control-Max-Age", "3600"); 
        resp.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization"); 
	    
	    Cookie cookie = new Cookie("ma","juan");
        cookie.setDomain("192.168.9.10");
        cookie.setPath("/");
        resp.addCookie(cookie);
	}
	
	@RequestMapping(value = "/corsTest")
	@ResponseBody
	public String corsTest(HttpServletRequest request,HttpServletResponse resp){
	    
	    resp.setHeader("Access-Control-Allow-Origin", "*"); 
	    resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE"); 
	    resp.setHeader("Access-Control-Max-Age", "3600"); 
	    resp.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization"); 
	    //resp.setHeader("Access-Control-Allow-Credentials","true"); 
	    
	    Cookie[] cookies = request.getCookies();
	    for(Cookie c : cookies)
	        System.out.println(c.getName()+"::"+c.getValue());
	    
	    String coco = request.getParameter("coco");
	    System.out.println("coco:"+coco);
	    
	    
	            
	    return "hello world";
	}
	
}
