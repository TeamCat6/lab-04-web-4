package com.harrypottervideoblog.model;

import java.util.List;

/**
 * Class Video. Objects of the class have the following characteristics:
 * <ul>Title of the video, Url of the video, Count of total watches, Count of total likes and
 * dislikes and a list for comments.</ul>
 *
 * @author Makasyeyeva Mariya
 **/
public class Video {
    private String name;
    private String url; // there is also a class URL
    private int watchCount;
    private int likes;
    private int dislikes;
    private List<Comment> comments;

    public Video(String name, String url, int watchCount, int likes, int dislikes, List<Comment> comments) {
        this.name = name;
        this.url = url;
        this.watchCount = watchCount;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWatchCount() {
        return watchCount;
    }

    public void setWatchCount(int watchCount) {
        this.watchCount = watchCount;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", dislikes=" + dislikes +
                '}';
    }
}
