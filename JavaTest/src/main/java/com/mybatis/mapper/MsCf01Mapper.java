package com.mybatis.mapper;

import com.mybatis.entity.MsCf01;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsCf01Mapper {
    int deleteByPrimaryKey(@Param("cfsb") BigDecimal cfsb, @Param("jgid") BigDecimal jgid);

    int insert(MsCf01 record);

    MsCf01 selectByPrimaryKey(@Param("cfsb") BigDecimal cfsb, @Param("jgid") BigDecimal jgid);

    List<MsCf01> selectAll();

    int updateByPrimaryKey(MsCf01 record);
}