package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserRepository {
   List<Map<String,Object>> findByUsername(@Param("username") String username);
   Integer getCount();
}
