package com.jojoweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/2.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName() {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode() {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId() {
        this.provinceId = provinceId;
    }
}
