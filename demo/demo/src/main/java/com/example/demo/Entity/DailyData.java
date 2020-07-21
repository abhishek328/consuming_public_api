package com.example.demo.Entity;

public class DailyData {

    private long dailyconfirmed ;
    private long dailydeceased ;
    private long dailyrecovered ;
    private long date ;
    private long  totalconfirmed;
    private long totaldeceased ;
    private long totalrecovered ;

    public DailyData() {
    }

    public DailyData(long dailyconfirmed, long dailydeceased, long dailyrecovered, long date, long totalconfirmed, long totaldeceased, long totalrecovered) {
        this.dailyconfirmed = dailyconfirmed;
        this.dailydeceased = dailydeceased;
        this.dailyrecovered = dailyrecovered;
        this.date = date;
        this.totalconfirmed = totalconfirmed;
        this.totaldeceased = totaldeceased;
        this.totalrecovered = totalrecovered;
    }

    public long getDailyconfirmed() {
        return dailyconfirmed;
    }

    public void setDailyconfirmed(long dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    public long getDailydeceased() {
        return dailydeceased;
    }

    public void setDailydeceased(long dailydeceased) {
        this.dailydeceased = dailydeceased;
    }

    public long getDailyrecovered() {
        return dailyrecovered;
    }

    public void setDailyrecovered(long dailyrecovered) {
        this.dailyrecovered = dailyrecovered;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getTotalconfirmed() {
        return totalconfirmed;
    }

    public void setTotalconfirmed(long totalconfirmed) {
        this.totalconfirmed = totalconfirmed;
    }

    public long getTotaldeceased() {
        return totaldeceased;
    }

    public void setTotaldeceased(long totaldeceased) {
        this.totaldeceased = totaldeceased;
    }

    public long getTotalrecovered() {
        return totalrecovered;
    }

    public void setTotalrecovered(long totalrecovered) {
        this.totalrecovered = totalrecovered;
    }

    @Override
    public String toString() {
        return "DailyData{" +
                "dailyconfirmed=" + dailyconfirmed +
                ", dailydeceased=" + dailydeceased +
                ", dailyrecovered=" + dailyrecovered +
                ", date=" + date +
                ", totalconfirmed=" + totalconfirmed +
                ", totaldeceased=" + totaldeceased +
                ", totalrecovered=" + totalrecovered +
                '}';
    }
}
