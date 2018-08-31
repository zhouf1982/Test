package com.mybatis.mapper;

import com.mybatis.entity.MsCf02;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsCf02Mapper {
    int deleteByPrimaryKey(@Param("sbxh") BigDecimal sbxh, @Param("jgid") BigDecimal jgid);

    int insert(MsCf02 record);

    MsCf02 selectByPrimaryKey(@Param("sbxh") BigDecimal sbxh, @Param("jgid") BigDecimal jgid);

    List<MsCf02> selectAll();

    int updateByPrimaryKey(MsCf02 record);
}