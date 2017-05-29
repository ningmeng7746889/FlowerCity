package org.qfnu.flowercity.controller;

import org.qfnu.flowercity.po.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 实现HttpRequestHandler接口的 处理器
 * Created by FGT on 2017/5/18.
 */
public class ItemsController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<Items> itemsList = new ArrayList<Items>();
        Items item1 = new Items();
        item1.setName("联想笔记本");
        item1.setPrice(6999f);
        item1.setDetail("This is lenvon!");
        item1.setCreatetime(new Date());
        Items item2 = new Items();
        item2.setName("MacBook Pro");
        item2.setPrice(6999f);
        item2.setDetail("This is MBP!");
        item2.setCreatetime(new Date());
        itemsList.add(item1);
        itemsList.add(item2);

        //设置模型数据
        httpServletRequest.setAttribute("itemsList",itemsList);
        //设置转发视图
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/item/itemsList.jsp").forward(httpServletRequest,httpServletResponse);

        //使用此方法可以修改response，设置相应函数格式，比如响应json数据
//        httpServletResponse.setCharacterEncoding("UTF-8");
//        httpServletResponse.setContentType("application/json;charset=utf-8");
//        httpServletResponse.getWriter().write("JSON串");
    }
}
