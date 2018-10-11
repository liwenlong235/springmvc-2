package com.iotek.handler;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Handler {
	/*@RequestMapping("date")
	public String date(Date date){
		System.out.println(date);
		return "success";
	}*/
	
	@RequestMapping("ajaxdate")
	@ResponseBody
	public String ajaxDate(String name){
		return name;
	}
	
	@RequestMapping("error")
	public String error(){
		int i = 5/0;
		return "success";
	}
	
	@ExceptionHandler
	public ModelAndView exceptionHandler(Exception ex){
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("exception", ex);
		System.out.println("�ҵ��쳣��"+ex);
		return mv;
	}
	
	
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }
}








