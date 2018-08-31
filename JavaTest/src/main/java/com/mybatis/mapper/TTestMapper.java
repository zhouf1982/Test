package com.mybatis.mapper;

import com.mybatis.entity.TTest;
import java.util.List;

public interface TTestMapper {
    int insert(TTest record);

    List<TTest> selectAll();
}