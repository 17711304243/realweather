package com.realweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by thekey on 2018/8/20.
 */

public class Weather {

    public String status;

    public AQI aqi;

    public Basic basic;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
