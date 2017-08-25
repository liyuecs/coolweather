package com.example.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yueli on 17-8-24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
