package com.example.myapplication.app;

/**
 * Created by Santhosh on 18/3/14.
 */
public class NewsItem {
    private int thumbnail;
    private String title;
    private String description;
    private int logo;
    private String source;
    private String time;

    public NewsItem(int thumbnail,String title, int logo, String source, String time) {
        super();
        this.thumbnail = thumbnail;
        this.title = title;
        this.logo = logo;
        this.time = time;
        this.source = source;

    }


    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
