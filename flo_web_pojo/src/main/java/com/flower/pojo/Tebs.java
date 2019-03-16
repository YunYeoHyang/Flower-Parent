package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "tebs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tebs {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id; // 主键

    @Column(name="name")
    private String name; // 标签名
}
