package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "product_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 主键

    @Column(name="name")
    private String name; // 物品名

    @Column(name="image")
    private String image; // 图片

    @Column(name="price")
    private double price; // 价格

    @Column(name="sku")
    private Integer sku; // sku

    @Column(name="product_id")
    private Integer productId; // 商品外键

    private Product product; // Product类

    @Column(name="categories_id")
    private Integer categoriesId; // 分类外键

    private Categories categories; // Categories类

    @Column(name="note")
    private String note; // 详情

    @Column(name="description")
    private String description; // 描述
}
