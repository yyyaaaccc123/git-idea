package com.itheima.service.Iservice;

import com.itheima.doman.Items;

import java.util.List;

public interface ItemsService {
    public List<Items> findAll();
    public Items findByid(Integer id);
}
