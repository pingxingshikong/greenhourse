package com.i1314i.greenhourse.po;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-04-28 9:15
 **/
public class JsonResult {
    private List<Wenshi>wenshis;
    private Integer success;
    private String msg;

    public List<Wenshi> getWenshis() {
        return wenshis;
    }

    public void setWenshis(List<Wenshi> wenshis) {
        this.wenshis = wenshis;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
