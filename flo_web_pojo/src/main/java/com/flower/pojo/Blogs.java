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
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="image")
    private String image;

    @Column(name="note")
    private String note;
}
