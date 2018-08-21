package com.realweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by thekey on 2018/8/20.
 */

public class Basic {

    //使JSON字段和java字段产生关联
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
