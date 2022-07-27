package com.myweb.controller;

import com.myweb.entity.Blog;
import com.myweb.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/Blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    //查询所有
    @GetMapping
    public String queryAllBlogs(Model model) {
        List<Blog> blogs = blogService.queryAllBlogs();
        model.addAttribute("myblogs", blogs);
        return "blogAdmin";

    }

    //根据id查询
    @GetMapping("/{id}")
    public String selectBlogById(@PathVariable Integer id, Model model) {
        Blog blog = blogService.selectBlogById(id);
        model.addAttribute("myblogs", blog);
        return "blogAdmin";
    }

    //删除
    @DeleteMapping("/{id}")
    public String deleteBlogById(@PathVariable Integer id) {
        blogService.deleteBlogById(id);
        return "blogAdmin";
    }

    //修改
    @PutMapping
    public String updateBlogById(Blog blog) {
        blogService.updateBlogById(blog);
        return "blogAdmin";
    }

    //新增
    @PostMapping
    public String addBlog(Blog blog) {
        blogService.addBlog(blog);
        return "blogAdmin";
    }

}
