package com.autocompletedemo.wrf_mac.coolweather.gson;

/**
 * Created by wrf_mac on 2017/4/7.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
