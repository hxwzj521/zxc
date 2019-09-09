package com.cn.controller;

import com.cn.pojo.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemList3 {

    @RequestMapping("/items31.action")
    public ModelAndView items31(){

        List<Items> itemsList = new ArrayList<Items>();
        Items items1 = new Items();
        items1.setName("lxnb");
        items1.setPrice(6000f);
        items1.setDetail("ThinkPad T430");

        Items items2 = new Items();
        items2.setName("ipnb");
        items2.setPrice(5000f);
        items2.setDetail("iphone6s");

        itemsList.add(items1);
        itemsList.add(items2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList",itemsList);
        modelAndView.setViewName("itemsList");

        return modelAndView;
    }
}
