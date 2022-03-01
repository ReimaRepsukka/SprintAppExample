package com.blog.reiska.data;

public class Blog {
    private String author;
    private String message;
    private int uid;

    private static int count = 0;

    public Blog( String author, String message ){
        this.author = author;
        this.message = message;
        this.uid = count++;
    }

    public Blog(){
        this("","");
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUid() {
        return uid;
    }
}
