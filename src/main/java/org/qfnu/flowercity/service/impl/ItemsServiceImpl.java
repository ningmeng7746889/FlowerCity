package org.qfnu.flowercity.service.impl;

import org.qfnu.flowercity.mapper.ItemsMapperCustom;
import org.qfnu.flowercity.po.ItemsCustom;
import org.qfnu.flowercity.po.ItemsQueryVo;
import org.qfnu.flowercity.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 商品管理
 * Created by FGT on 2017/5/22.
 */
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

//    @Autowired
//    private ItemsMapper itemsMapper;

    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception{
        //通过ItemsMapperCustom查询数据库
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
}
