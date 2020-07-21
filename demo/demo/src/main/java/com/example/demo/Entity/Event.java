package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
    private String title;
    private String color;
    private String rank ;
    private float rankNum;


    public Event() {
    }

    public Event(String title, String color, String rank, float rankNum) {
        this.title = title;
        this.color = color;
        this.rank = rank;
        this.rankNum = rankNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public float getRankNum() {
        return rankNum;
    }

    public void setRankNum(float rankNum) {
        this.rankNum = rankNum;
    }


    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", rank='" + rank + '\'' +
                ", rankNum=" + rankNum +
                '}';
    }
}
