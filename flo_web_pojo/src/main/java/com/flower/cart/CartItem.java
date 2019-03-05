package com.flower.cart;

import lombok.Data;

@Data
public class CartItem {

    private Long id;

    private Integer sku;

    private String name;

    private Double price;

    private Integer count;//购买数量

    private String image;

}
