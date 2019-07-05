package com.itheima.controller;

import com.itheima.doman.Items;
import com.itheima.service.Iservice.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping(name = "/findByid")
    public String findByid(Model model){
        Items items = itemsService.findByid(1);
        model.addAttribute("items",items);
        return "itemDetail";
    }
}
