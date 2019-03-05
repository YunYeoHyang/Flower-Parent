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
    private Long id;

    @Column(name="word")
    private String word;

    @Column(name="star")
    private Integer star;

    @Column(name="uid")
    private Long uid;
    private User user;

    @Column(name="pid")
    private Integer pid;
    private ProductDetails productDetails;
}
