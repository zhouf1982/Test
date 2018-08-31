package com.mybatis.mapper;

import com.mybatis.entity.MsBrda;
import java.math.BigDecimal;
import java.util.List;

public interface MsBrdaMapper {
    int deleteByPrimaryKey(BigDecimal brid);

    int insert(MsBrda record);

    MsBrda selectByPrimaryKey(BigDecimal brid);

    List<MsBrda> selectAll();

    int updateByPrimaryKey(MsBrda record);
}