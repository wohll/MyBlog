package com.myweb.service.impl;

import com.myweb.dao.BlogDao;
import com.myweb.entity.Blog;
import com.myweb.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public List<Blog> queryAllBlogs() {

        return blogDao.selectAllBlog();
    }

    @Override
    public List<Blog> limitByPagenum(Integer pagenum) {
        Integer start = (pagenum - 1) * 10;
        List<Blog> limitblogs = blogDao.limitBlog(start);
        return limitblogs;
    }

    @Override
    public void deleteBlogById(Integer id) {
        blogDao.deleteBlogById(id);
    }

    @Override
    public void addBlog(Blog blog) {

        blogDao.addBlog(blog);

    }

    @Override
    public Blog selectBlogById(Integer id) {
        return blogDao.selectBlogById(id);
    }

    @Override
    public void updateBlogById(Blog blog) {
        blogDao.updateBlogById(blog);
    }
}
