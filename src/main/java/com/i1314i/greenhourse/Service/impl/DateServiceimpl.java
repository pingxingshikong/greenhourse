package com.i1314i.greenhourse.Service.impl;

import com.i1314i.greenhourse.Service.DateService;
import com.i1314i.greenhourse.mapper.WenshiMapper;
import com.i1314i.greenhourse.po.Wenshi;
import com.i1314i.greenhourse.po.WenshiExample;
import com.i1314i.greenhourse.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-04-28 8:58
 **/
@Component("DateService")
public class DateServiceimpl implements DateService  {
    @Autowired
    private WenshiMapper wenshiMapper;
    @Override
    public List<Wenshi> datalist(String type,Integer limit) throws Exception {
        if(limit==null||limit==0) limit=15;
        WenshiExample wenshiExample=new WenshiExample();
        wenshiExample.setDistinct(true);
        wenshiExample.setOrderByClause("DATETIME desc");
        WenshiExample.Criteria criteria=wenshiExample.createCriteria();
        criteria.andDatetimeGreaterThan(TimeUtils.getpreDay(new Date()));
        criteria.andPlotidEqualTo(type);
        wenshiExample.setStart(0);
        wenshiExample.setLimit(limit);
        List<Wenshi> data=null;
        data= wenshiMapper.selectByExample(wenshiExample);


        if(data.size()<=10){
            WenshiExample wenshiExample1=new WenshiExample();
            wenshiExample1.setDistinct(true);
            wenshiExample1.setOrderByClause("DATETIME desc");
            WenshiExample.Criteria criteria1=wenshiExample.createCriteria();
            criteria1.andPlotidEqualTo(type);
            wenshiExample1.setStart(0);
            wenshiExample1.setLimit(limit);
            data= wenshiMapper.selectByExample(wenshiExample1);
        }
        return data;
    }
}
