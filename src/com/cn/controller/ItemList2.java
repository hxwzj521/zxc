//package com.cn.controller;
//
//import com.cn.pojo.Items;
//import org.springframework.web.HttpRequestHandler;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ItemList2 implements HttpRequestHandler {
//
//    @Override
//    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
////        ModelAndView mav = new ModelAndView();
////        mav.addObject("itemList",itemsList);
//        request.setAttribute("itemList",itemsList);
//        request.getRequestDispatcher("/WEB-INF/jsp/order/itemsList.jsp").forward(request, response);
////        mav.setViewName("itemsList");
//    }
//}
