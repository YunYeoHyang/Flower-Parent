package com.flower.vo;

import lombok.Data;

@Data
public class OneSkuResult {

    private Long id; // 主键
    private Integer sku; // sku
    private String name; // 名字
    private Double price; // 价格
    private String image; // 图片
}