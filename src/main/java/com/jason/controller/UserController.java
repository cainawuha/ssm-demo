package com.jason.controller;

import com.jason.bean.User;
import com.jason.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/login")
    public String login(String userName, String userPwd, HttpServletRequest request){
        User user = userService.checkLogin(userName, userPwd);
        if (user==null) {
            request.setAttribute("tips","username or password is wrong!");
            return "/login.jsp";
        }else {
            request.getSession().setAttribute("user",user);
            return "redirect:/index.jsp";
        }
    }
}
