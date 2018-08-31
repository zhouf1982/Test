package com.mybatis.mapper;

import com.mybatis.entity.MsZffp;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsZffpMapper {
    int deleteByPrimaryKey(@Param("mzxh") BigDecimal mzxh, @Param("jgid") BigDecimal jgid);

    int insert(MsZffp record);

    MsZffp selectByPrimaryKey(@Param("mzxh") BigDecimal mzxh, @Param("jgid") BigDecimal jgid);

    List<MsZffp> selectAll();

    int updateByPrimaryKey(MsZffp record);
}