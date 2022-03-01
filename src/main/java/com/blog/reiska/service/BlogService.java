package com.blog.reiska.service;

import com.blog.reiska.data.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {

    @Autowired
    BlogFileService myFileService;
    private List<Blog> blogs = new ArrayList<>();


    public BlogService(){
        try {
            blogs = myFileService.readBlogsFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addBlog(Blog blog){
        blogs.add(blog);
    }

    public List<Blog> getBlogs(){
        return new ArrayList<>(blogs);
    }

    public List<Blog> getBlogsByAuthor(String author){
        List<Blog> foundBlogs = new ArrayList<>();

        for(Blog b : blogs){
            if( b.getAuthor().equals(author) ){
                foundBlogs.add(b);
            }
        }

        return foundBlogs;
    }
}
