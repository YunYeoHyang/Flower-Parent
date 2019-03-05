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
    private Long uid;

    @Column(name="user_name")
    private String name;

    @Column(name="password")
    private String password;

    @Column(name="sex")
    private String sex;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="face")
    private String face;
}
