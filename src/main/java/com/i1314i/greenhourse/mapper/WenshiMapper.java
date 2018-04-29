package com.i1314i.greenhourse.mapper;

import com.i1314i.greenhourse.po.Wenshi;
import com.i1314i.greenhourse.po.WenshiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WenshiMapper {
    long countByExample(WenshiExample example);

    int deleteByExample(WenshiExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Wenshi record);

    int insertSelective(Wenshi record);

    List<Wenshi> selectByExample(WenshiExample example);

    Wenshi selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Wenshi record, @Param("example") WenshiExample example);

    int updateByExample(@Param("record") Wenshi record, @Param("example") WenshiExample example);

    int updateByPrimaryKeySelective(Wenshi record);

    int updateByPrimaryKey(Wenshi record);
}