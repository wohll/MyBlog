package com.myweb.service;

import com.myweb.entity.Blog;


import java.util.List;



public interface BlogService {
    //查询所有文章
    public List<Blog> queryAllBlogs();
    //文章分页
    public List<Blog> limitByPagenum(Integer pagenum);
    //根据id删除文章
    public void deleteBlogById(Integer id);
    //添加文章
    public void addBlog(Blog blog);
    //根据id查询文章
    public Blog selectBlogById(Integer id);
    //修改文章
    public void updateBlogById(Blog blog);
}
