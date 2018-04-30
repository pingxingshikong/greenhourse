package com.i1314i.greenhourse.Service.impl;

import com.i1314i.greenhourse.Service.DateService;
import com.i1314i.greenhourse.mapper.WenshiMapper;
import com.i1314i.greenhourse.po.Datas;
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

    /**
     * 获取分页数据
     * @param datas
     * @return
     * @throws Exception
     */
    @Override
    public List<Wenshi> datalist(Datas datas) throws Exception {

        List<Wenshi>data=null;
        WenshiExample wenshiExample1=new WenshiExample();
        wenshiExample1.setDistinct(true);
        wenshiExample1.setOrderByClause("DATETIME desc");
        WenshiExample.Criteria criteria1=wenshiExample1.createCriteria();
        criteria1.andPlotidEqualTo(datas.getHoursetype());
        wenshiExample1.setStart(datas.getCurrentPage()-1);
        wenshiExample1.setLimit(datas.getLimit());
        data= wenshiMapper.selectByExample(wenshiExample1);

        return data;
    }

    /**
     * 查询数据总数
     * @param datas
     * @return
     */
    @Override
    public Integer totalCounts(Datas datas) {
        WenshiExample wenshiExample=new WenshiExample();
        WenshiExample.Criteria criteria=wenshiExample.createCriteria();
        criteria.andPlotidEqualTo(datas.getHoursetype());
        Integer count= Math.toIntExact(wenshiMapper.countByExample(wenshiExample));

        return count;
    }
}
