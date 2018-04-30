package com.i1314i.greenhourse.Service;

import com.i1314i.greenhourse.po.Datas;
import com.i1314i.greenhourse.po.Wenshi;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-04-28 8:57
 **/
public interface DateService {
    List<Wenshi> datalist(Datas datas)throws Exception;
    Integer  totalCounts(Datas datas);

}
