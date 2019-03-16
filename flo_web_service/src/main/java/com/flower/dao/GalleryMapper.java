package com.flower.dao;

import com.flower.pojo.Gallery;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface GalleryMapper extends Mapper<Gallery> {

    @Select("select * from gallery where categories = #{categories}")
    @Results({
            @Result(property = "name",column = "name"),
            @Result(property = "image",column = "image"),
            @Result(property = "categories",column = "categories"),
    })
    List<Gallery> findGalleryByCategories(String categories);
}
