package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.doman.Items;
import com.itheima.service.Iservice.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ItemsTest {
    @Test
    public void daoTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);
        List<Items> all = itemsDao.findAll();
        System.out.println(all);
    }
    @Test
    public void serviceTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService= applicationContext.getBean(ItemsService.class);
        List<Items> itemsList = itemsService.findAll();
        System.out.println(itemsList);
    }
}
