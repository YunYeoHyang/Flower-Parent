package com.flower.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categories {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="create_time")
    private Date createTime;

    @Column(name="tittle")
    private String tittle;
}
