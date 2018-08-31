package com.mybatis.mapper;

import com.mybatis.entity.YfKcmx;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YfKcmxMapper {
    int deleteByPrimaryKey(@Param("sbxh") BigDecimal sbxh, @Param("jgid") BigDecimal jgid);

    int insert(YfKcmx record);

    YfKcmx selectByPrimaryKey(@Param("sbxh") BigDecimal sbxh, @Param("jgid") BigDecimal jgid);

    List<YfKcmx> selectAll();

    int updateByPrimaryKey(YfKcmx record);
}