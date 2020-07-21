package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Calendar {
    private String date;
    private String season ;
    @JsonProperty("season_week")
    private int seasonWeek;
    @JsonProperty("celebrations")
    private List<Event> celebration ;
    @JsonProperty("weekday")
    private String weekday;

    public Calendar() {
    }

    public Calendar(String date, String season, int seasonWeek, List<Event> celebration, String weekday) {
        this.date = date;
        this.season = season;
        this.seasonWeek = seasonWeek;
        this.celebration = celebration;
        this.weekday = weekday;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getSeasonWeek() {
        return seasonWeek;
    }

    public void setSeasonWeek(int seasonWeek) {
        this.seasonWeek = seasonWeek;
    }

    public List<Event> getCelebration() {
        return celebration;
    }

    public void setCelebration(List<Event> celebration) {
        this.celebration = celebration;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}
