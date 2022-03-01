package com.blog.reiska.service;

import com.blog.reiska.data.Blog;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class BlogFileService {
    public void writeBlogsToFile(List<Blog> blogs) throws IOException {
        FileWriter fw = new FileWriter(  new File("blogs.txt"));
    }

    public List<Blog> readBlogsFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("blogs.txt"));
        List<Blog> blogs = new ArrayList<>();
        //Lue tiedostosta esim. rivi kerrallaan blogit ja luo oliot
        //ja lisää uuteen listaan

        return blogs;
    }
}
