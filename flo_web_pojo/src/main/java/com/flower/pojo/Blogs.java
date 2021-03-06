package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "Blog")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Blogs {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 主键

    @Column(name="name")
    private String name; // 标题

    @Column(name="image")
    private String image; // 图片

    @Column(name="note")
    private String note; // 详情
}
