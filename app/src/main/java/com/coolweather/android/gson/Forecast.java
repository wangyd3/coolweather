package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangyd on 2017/8/7.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max = "0";
        public String min = "0";
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }


}
