package com.flower.dao;

import com.flower.pojo.ProductDetails;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface ProductDetailsMapper extends Mapper<ProductDetails>{

    @Select("select * from product_details where sku = #{sku}")
    @Results({
            @Result(property = "name",column = "name"),
            @Result(property = "image",column = "image"),
            @Result(property = "price",column = "price"),
            @Result(property = "note",column = "note"),
            @Result(property = "sku",column = "sku"),
            @Result(property = "description",column = "description")
    })
    ProductDetails findDetailsBySku(Integer sku);
}
