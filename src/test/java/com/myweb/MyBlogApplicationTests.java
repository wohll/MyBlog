package com.myweb;

import com.myweb.entity.Blog;
import com.myweb.entity.User;
import com.myweb.service.BlogService;
import com.myweb.service.Loginservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyBlogApplicationTests {
    @Autowired
    private BlogService blogService;
    @Autowired
    private Loginservice loginservice;

    //查询所有
    @Test
    public void testqurey() {
        List<Blog> all = blogService.queryAllBlogs();
        System.out.println(all);
    }
//根据id查询
    @Test
    public void test1() {
        Blog blog = blogService.selectBlogById(1);
        System.out.println(blog);
    }
//添加
    @Test
    public void test2() {
        Blog blog = new Blog();
        blog.setTitle("test");
        blog.setContent("testc");
        blogService.addBlog(blog);
    }
//根据id删除
    @Test
    public void test3() {
        blogService.deleteBlogById(28);
    }

    //修改
    @Test
    public void test4() {
        Blog blog = new Blog();
        blog.setTitle("111111111111");
        blog.setContent("te416456c");
        blog.setId(21);
        blogService.updateBlogById(blog);
    }
//分页
    @Test
    public void test5() {
        Integer pagenum = 3;
        List<Blog> blogs = blogService.limitByPagenum(pagenum);
        System.out.println(blogs);
    }
//登录，参数：用户名+密码
    @Test
    public void test6() {

        User login = loginservice.login("111", "111");
        System.out.println(login);

    }
}
