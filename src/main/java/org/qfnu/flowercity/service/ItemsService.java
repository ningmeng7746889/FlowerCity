package org.qfnu.flowercity.service;

import org.qfnu.flowercity.po.ItemsCustom;
import org.qfnu.flowercity.po.ItemsQueryVo;

import java.util.List;

/**
 * 商品管理service
 * Created by FGT on 2017/5/22.
 */
public interface ItemsService {
    //商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
