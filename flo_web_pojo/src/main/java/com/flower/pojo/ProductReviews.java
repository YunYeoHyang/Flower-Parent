package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "product_reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductReviews {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 主键

    @Column(name="word")
    private String word; // 评论语句

    @Column(name="star")
    private Integer star; // 星级

    @Column(name="uid")
    private Long uid; // user表外键
    private User user; // User类

    @Column(name="pid")
    private Integer pid; // ProductDetails表外键
    private ProductDetails productDetails; // Product Details类
}
