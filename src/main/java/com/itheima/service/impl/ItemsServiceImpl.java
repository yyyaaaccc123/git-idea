package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.doman.Items;
import com.itheima.service.Iservice.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    public Items findByid(Integer id) {
        return itemsDao.findByid(id);
    }
}
