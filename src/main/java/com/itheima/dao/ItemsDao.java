package com.itheima.dao;

import com.itheima.doman.Items;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemsDao {
    @Select("select * from user")
    public List<Items> findAll();
    @Select("select * from user where uid =#{id}")
    public Items findByid(Integer id);
}
