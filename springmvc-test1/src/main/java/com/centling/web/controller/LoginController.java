package com.centling.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.centling.domain.LoginForm;

/**
 * Created by centling on 2014/7/25.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, LoginForm command) {
        String username = command.getUsername();
        ModelAndView mv = new ModelAndView("/index/index", "command", "LOGIN SUCCESS, " + username);
        return mv;
    }
}
