package com.myweb.controller;

import com.myweb.entity.Blog;
import com.myweb.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private BlogService blogService;
    //跳转到博客首页，并获取所有文章，展现在首页
    @GetMapping("/")
    public String limitByPagenum( Model model) {
        List<Blog> blog= blogService.queryAllBlogs();
        model.addAttribute("myblogs", blog);
        return "index";
    }
}
