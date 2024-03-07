package com.harrypottervideoblog.model;

import java.util.List;
/**
 * Class VideoBlog. Objects of the class have the following characteristics:
 * <ul>Author, List of Videos</ul>
 * @author Makasyeyeva Mariya
 * **/
public class VideoBlog {
    private String videoBlogger;
    private List<Video> videos;

    public VideoBlog(String videoBlogger, List<Video> videos) {
        this.videoBlogger = videoBlogger;
        this.videos = videos;
    }

    public String getVideoBlogger() {
        return videoBlogger;
    }

    public void setVideoBlogger(String videoBlogger) {
        this.videoBlogger = videoBlogger;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
