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
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="image")
    private String image;

    @Column(name="price")
    private double price;

    @Column(name="sku")
    private Integer sku;

    @Column(name="product_id")
    private Integer productId;

    private Product product;

    @Column(name="categories_id")
    private Integer categoriesId;

    private Categories categories;

    @Column(name="note")
    private String note;

    @Column(name="description")
    private String description;
}
