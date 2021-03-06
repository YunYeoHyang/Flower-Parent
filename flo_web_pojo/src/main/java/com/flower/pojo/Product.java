package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 主键

    @Column(name="name")
    private String name; // 物品名

    @Column(name="image")
    private String image; // 图片

    @Column(name="price")
    private double price; // 价格

    @Column(name="description")
    private String description; // 描述

    @Column(name="sku")
    private Integer sku; // sku
}
