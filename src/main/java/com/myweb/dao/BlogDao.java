package com.myweb.dao;

import com.myweb.entity.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogDao {
    //查询所有文章
    List<Blog> selectAllBlog();
    //分页查询
    List<Blog> limitBlog(Integer start);
    //根据id删除文章
    public void deleteBlogById(Integer id);
    //添加文章
    public void addBlog(Blog blog);
    //根据id查询文章
    public Blog selectBlogById(Integer id);
    //修改文章
    public void updateBlogById(Blog blog);

}
