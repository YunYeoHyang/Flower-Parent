package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "gallery")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Gallery {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 主键

    @Column(name="name")
    private String name; // 标题

    @Column(name="image")
    private String image; // 图片

}
