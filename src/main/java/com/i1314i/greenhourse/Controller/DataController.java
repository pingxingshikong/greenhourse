package com.i1314i.greenhourse.Controller;

import com.i1314i.greenhourse.Service.DateService;
import com.i1314i.greenhourse.mapper.WenshiMapper;
import com.i1314i.greenhourse.po.Datas;
import com.i1314i.greenhourse.po.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;


/**
 * @author 平行时空
 * @created 2018-04-28 1:36
 **/
@RestController
@Async
public class DataController {
    private Logger logger= LoggerFactory.getLogger(DataController.class);
    @Autowired
    private DateService dateService;

    @RequestMapping(value = "/getdata",method = {RequestMethod.POST})
    public JsonResult getWenshiDate(Datas datas)throws Exception{

        JsonResult jsonResult=new JsonResult();
        if(datas.getHoursetype()==null||datas.getHoursetype().trim().equals("")){
            jsonResult.setSuccess(0);
            jsonResult.setMsg("请求参数错误");
            logger.info("请求参数错误");
        }else{
            jsonResult.setSuccess(1);
            jsonResult.setWenshis(dateService.datalist(datas.getHoursetype(),datas.getLimit()));
        }
        return jsonResult;
    }
}
