package com.i1314i.greenhourse.po;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Wenshi {
    private Integer pid;

    private Date datetime;
    private String newtime;

    private String airtemp;


    private String airhumi;

    private String soilhumi1;

    private String soilhumi2;

    private String plotid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }


    public String getNewtime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
        return simpleDateFormat.format(datetime);
    }
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getAirtemp() {
        return airtemp;
    }

    public void setAirtemp(String airtemp) {
        this.airtemp = airtemp == null ? null : airtemp.trim();
    }

    public String getAirhumi() {
        return airhumi;
    }

    public void setAirhumi(String airhumi) {
        this.airhumi = airhumi == null ? null : airhumi.trim();
    }

    public String getSoilhumi1() {
        return soilhumi1;
    }

    public void setSoilhumi1(String soilhumi1) {
        this.soilhumi1 = soilhumi1 == null ? null : soilhumi1.trim();
    }

    public String getSoilhumi2() {
        return soilhumi2;
    }

    public void setSoilhumi2(String soilhumi2) {
        this.soilhumi2 = soilhumi2 == null ? null : soilhumi2.trim();
    }

    public String getPlotid() {
        return plotid;
    }

    public void setPlotid(String plotid) {
        this.plotid = plotid == null ? null : plotid.trim();
    }
}