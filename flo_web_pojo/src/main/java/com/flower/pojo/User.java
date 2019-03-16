package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long uid; // 主键

    @Column(name="user_name")
    private String name; // 名字

    @Column(name="password")
    private String password; // 密码

    @Column(name="sex")
    private String sex; // 性别

    @Column(name="email")
    private String email; // 邮箱

    @Column(name="phone")
    private String phone; // 手机号

    @Column(name="face")
    private String face; // 头像
}
