package com.springboottest.domain.repository;

import com.springboottest.domain.entity.TConnectTest;
import java.util.List;

public interface TConnectTestMapper {
    int insert(TConnectTest record);

    List<TConnectTest> selectAll();
}