package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categories {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 分类主键

    @Column(name="name")
    private String name; // 标题
}
