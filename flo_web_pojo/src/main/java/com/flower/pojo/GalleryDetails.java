package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "gallery_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GalleryDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 主键

    @Column(name="name")
    private String name; // 标题

    @Column(name="image")
    private String image; // 图片

    @Column(name="gallery_id")
    private String gId; // 外键

    private Gallery gallery;

    @Column(name="note")
    private String note; // 详情

    @Column(name="client")
    private String client; // 设计人名

    @Column(name="location")
    private String location; // 地址

    @Column(name="date")
    private String date; // 时间

    @Column(name="categories")
    private String categories; // 标签
}
