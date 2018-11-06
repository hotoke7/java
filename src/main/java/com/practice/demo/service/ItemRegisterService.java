package com.practice.demo.service;

import com.practice.demo.entity.Item;
import com.practice.demo.entity.ItemRepository;
import com.practice.demo.form.ItemRegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品登録サービス。
 */
@Service
public class ItemRegisterService {

    /**
     * 商品リポジトリ
     */
    private final ItemRepository itemRepository;

    @Autowired
    public ItemRegisterService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    /**
     * 登録処理。
     *
     * @param item 商品エンティティ
     */
    @Transactional
    public void register(Item item) {
        itemRepository.save(item);
    }

    /**
     * フォームから商品エンティティを生成する。
     *
     * @param itemRegisterForm フォーム
     * @return 商品エンティティ
     */
    public Item createItem(ItemRegisterForm itemRegisterForm) {
        Item item = new Item();
        item.setName(itemRegisterForm.getName());
        int price = Integer.parseInt(itemRegisterForm.getPrice());
        item.setPrice(price);
        if (price >= 10000) {
            item.setWarehouse("二子玉川倉庫");
        } else {
            item.setWarehouse("新橋倉庫");
        }
        return item;
    }

    /**
     * 値段が数字であるか判定する。
     *
     * @param price 値段
     * @return true:数字 false:数字以外
     */
    public boolean validatePrice(String price) {
        try {
            Integer.parseInt(price);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
