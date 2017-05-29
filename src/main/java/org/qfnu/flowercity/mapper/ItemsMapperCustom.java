package org.qfnu.flowercity.mapper;

import org.qfnu.flowercity.po.ItemsCustom;
import org.qfnu.flowercity.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by FGT on 2017/5/22.
 */
public interface ItemsMapperCustom {
    //商品列表查询
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
