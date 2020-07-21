package com.example.demo.Entity;

import java.util.List;

public class Covid19 {
   private List<DailyData> casesTimeSeries ;
   private List<StateData> stateWise ;
   private List<TestedData> Tested ;

    public Covid19() {
    }

    public Covid19(List<DailyData> casesTimeSeries, List<StateData> stateWise, List<TestedData> tested) {
        this.casesTimeSeries = casesTimeSeries;
        this.stateWise = stateWise;
        Tested = tested;
    }

    public List<DailyData> getCasesTimeSeries() {
        return casesTimeSeries;
    }

    public void setCasesTimeSeries(List<DailyData> casesTimeSeries) {
        this.casesTimeSeries = casesTimeSeries;
    }

    public List<StateData> getStateWise() {
        return stateWise;
    }

    public void setStateWise(List<StateData> stateWise) {
        this.stateWise = stateWise;
    }

    public List<TestedData> getTested() {
        return Tested;
    }

    public void setTested(List<TestedData> tested) {
        Tested = tested;
    }

    @Override
    public String toString() {
        return "Covid19{" +
                "casesTimeSeries=" + casesTimeSeries +
                ", stateWise=" + stateWise +
                ", Tested=" + Tested +
                '}';
    }
}
