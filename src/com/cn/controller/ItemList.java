//package com.cn.controller;
//
//
//import com.cn.pojo.Items;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ItemList implements Controller {
//
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//
//        List<Items> itemsList = new ArrayList<Items>();
//        Items items1 = new Items();
//        items1.setName("lxnb");
//        items1.setPrice(6000f);
//        items1.setDetail("ThinkPad T430");
//
//        Items items2 = new Items();
//        items2.setName("ipnb");
//        items2.setPrice(5000f);
//        items2.setDetail("iphone6s");
//
//        itemsList.add(items1);
//        itemsList.add(items2);
//
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("itemList",itemsList);
//        mav.setViewName("itemsList");
//
//        return mav;
//    }
//}
