package com.myweb.controller;

import com.myweb.entity.User;
import com.myweb.service.Loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
@Autowired
   private Loginservice loginservice;
@PostMapping("/logining")
public String login(String username, String password, Model model, HttpSession session){
    User user = loginservice.login(username, password);
    if (user != null){
        session.setAttribute("User",user.getUsername());
        return "blogAdmin";
    }else {
        model.addAttribute("login_msg", "用户名或密码错误!");
        return "login";
    }

}
    @GetMapping("/logout")
    public String loginout( HttpSession session){
        session.removeAttribute("User"); //退出登录则清除session中的用户信息
        return "login";

    }
}
