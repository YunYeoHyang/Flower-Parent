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
    private Long id;

    @Column(name="product_details_id")
    private Integer pid;

    @Column(name="image")
    private String image;
}
