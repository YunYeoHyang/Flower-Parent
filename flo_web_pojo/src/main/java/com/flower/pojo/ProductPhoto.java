package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "product_photo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductPhoto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 主键

    @Column(name="product_details_id")
    private Integer pid; // ProductDetails外键

    private ProductDetails productDetails; // ProductDetails类

    @Column(name="image")
    private String image; // 图片
}
