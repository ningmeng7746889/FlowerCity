package org.qfnu.flowercity.controller;

import org.qfnu.flowercity.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 实现controller接口的处理器
 * Created by FGT on 2017/5/18.
 */
public class ItemsController1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
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
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",itemsList);
        modelAndView.setViewName("item/itemsList");
        return modelAndView;
    }
}
