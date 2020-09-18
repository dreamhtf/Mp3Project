package com.shangmao.mp3.controller;

import com.shangmao.mp3.service.IUserService;
import com.shangmao.mp3.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response){
        RequestUtil.GeetestBy(request, response);
        Map<String, Object> queryMap = RequestUtil.getQueryMap(request);
        System.out.println(queryMap);
    }


    @RequestMapping("/GeetestOnload")
    public void GeetestOnload(HttpServletRequest request, HttpServletResponse response){
        //打开页面 出现验证码的ajax异步通信
        RequestUtil.GeetestOnload(request, response);
    }

}