package org.qfnu.flowercity.controller;

import org.qfnu.flowercity.po.ItemsCustom;
import org.qfnu.flowercity.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 商品的controller
 * Created by FGT on 2017/5/22.
 */
@Controller
//为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
//比如：商品列表：/items/queryItems.action
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/queryItemsTest")
    public ModelAndView queryItems(HttpServletRequest request)throws Exception{
        //测试forward后request是否可以共享
        System.out.println(request.getParameter("id"));

        // 调用service查找 数据库，查询商品列表
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);

        ModelAndView modelAndView = new ModelAndView();
        // 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList",itemsList);
        // 指定视图
        // 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
        // modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        // 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
        modelAndView.setViewName("item/itemsList.jsp");
        return modelAndView;
    }
}
