package com.flower.dao;
import com.flower.pojo.Product;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface ProductMapper extends Mapper<Product>{

    @Select("select * from product where sku = #{sku}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "image",column = "image"),
            @Result(property = "price",column = "price"),
            @Result(property = "sku",column = "sku")
    })
    Product selectBySku(Integer sku);
}
