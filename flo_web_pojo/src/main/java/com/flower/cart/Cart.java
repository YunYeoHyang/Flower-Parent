package com.flower.cart;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Cart {

    private Map<Integer, CartItem > data = new HashMap<>();
    private Double total;

    /**
     * 添加购物车
     * @param cartItem
     */
    public void addCart(CartItem cartItem) {
        CartItem temp = data.get(cartItem.getSku());
        if(temp == null) {
            data.put( cartItem.getSku() , cartItem);
        } else {
            temp.setCount( cartItem.getCount() + temp.getCount() );
        }
    }

    /**
     * 更新购物车
     * @param sku
     * @param count
     */
    public void updateCart(Integer sku, Integer count) {

        CartItem cartItem = data.get(sku);

        if ( cartItem != null ){
            cartItem.setCount(count);
        }
    }

    /**
     * 删除购物车
     * @param sku
     */
    public void deleteCart(Integer sku) {

        data.remove(sku);
    }

    public Double getTotal() {
        double sum = 0.0;
        for (CartItem cartItem : data.values()) {
            //只统计勾选的价格
                sum += ( cartItem.getPrice() * cartItem.getCount());

        }
        return sum;
    }
}

