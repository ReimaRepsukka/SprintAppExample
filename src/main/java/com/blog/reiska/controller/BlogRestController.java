package com.blog.reiska.controller;

import com.blog.reiska.data.Blog;
import com.blog.reiska.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogRestController {

    @Autowired
    BlogService myBlogService;

    @GetMapping("blogs")
    public List<Blog> getBlogs(){
        return myBlogService.getBlogs();
    }

    @GetMapping("blogs/{author}")
    public List<Blog> getAuthorBlogs(@PathVariable String author){
        return myBlogService.getBlogsByAuthor(author);
    }

    @PostMapping("addblog")
    public String addBlog(@RequestBody Blog blog){
        myBlogService.addBlog(blog);
        return "";
    }

    @PostMapping("addbloginfo")
    public String addBlogInfo(@RequestParam String author, @RequestParam String message){
        myBlogService.addBlog( new Blog(author, message)  );
        return "";
    }
}
