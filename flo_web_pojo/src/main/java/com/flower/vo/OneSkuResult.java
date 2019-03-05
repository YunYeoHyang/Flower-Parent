package com.flower.vo;

import lombok.Data;

@Data
public class OneSkuResult {

    private Long id;
    private Integer sku;
    private String name;
    private Double price;
    private String image;
}