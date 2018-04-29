package com.i1314i.greenhourse.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 平行时空
 * @created 2018-04-28 8:41
 **/
public class TimeUtils {
//     public static Date getNextDay(Date date) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.add(Calendar.DAY_OF_MONTH, -1);//+1今天的时间加一天
//        date = calendar.getTime();
//        return date;
//    }
    public static Date getpreDay(Date date) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);//+1今天的时间加一天
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date = calendar.getTime();
        date=sdf.parse(sdf.format(date));
        return date;
    }
}
