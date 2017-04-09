package com.autocompletedemo.wrf_mac.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wrf_mac on 2017/4/7.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
