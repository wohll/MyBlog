package com.myweb.controller;

import com.myweb.entity.Blog;
import com.myweb.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageJumpController {
    @Autowired
    private BlogService blogService;
//跳转到文章发布页
    @GetMapping("/publishBlog")
    public String publishBlogs() {

        return "publishBlog";
    }
    //跳转到后台首页
    @GetMapping("/admin")
    public String admin() {

        return "blogAdmin";
    }

    //通过文章id查找文章，并返回文章编辑页面
    @GetMapping("/editBlog/{id}")
    public String editBlogs(@PathVariable Integer id, Model model) {
        Blog blog = blogService.selectBlogById(id);
        model.addAttribute("myblogs", blog);
        return "editBlog";
    }
    //通过文章id查找文章，并返回文章详情页面
    @GetMapping("/article/{id}")
    public String selectBlogById(@PathVariable Integer id, Model model) {
        Blog blog = blogService.selectBlogById(id);
        model.addAttribute("myblogs", blog);
        return "article";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
