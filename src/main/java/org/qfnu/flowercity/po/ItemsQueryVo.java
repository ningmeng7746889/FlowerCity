package org.qfnu.flowercity.po;

/**
 * 商品包装对象
 * Created by FGT on 2017/5/22.
 */
public class ItemsQueryVo {
    //商品信息
    private Items items;
    //为了系统 可扩展性，对原始生成的po进行扩展
    private ItemsCustom itemsCustom;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }
}
