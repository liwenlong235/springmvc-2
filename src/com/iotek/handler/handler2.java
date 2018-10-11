package com.iotek.handler;


import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.text.SimpleDateFormat;


/**
 * Created by 99234 on 2018/9/25.
 */
@Controller
public class handler2 {
    @RequestMapping("date")
    public String date(Date date){
        System.out.println(date);
        return "success";
    }
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }
}
