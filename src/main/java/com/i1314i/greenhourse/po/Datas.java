package com.i1314i.greenhourse.po;

/**
 * @author 平行时空
 * @created 2018-04-28 11:54
 **/
public class Datas {
    private String hoursetype;
    private Integer limit;//每页页码数
    private Integer currentPage;//当前页码

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getHoursetype() {
        return hoursetype;
    }

    public void setHoursetype(String hoursetype) {
        this.hoursetype = hoursetype;
    }

    @Override
    public String toString() {
        return "Datas{" +
                "hoursetype='" + hoursetype + '\'' +
                ", limit=" + limit +
                ", currentPage=" + currentPage +
                '}';
    }
}
