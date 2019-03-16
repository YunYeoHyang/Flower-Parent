package com.flower.dao;

import com.flower.pojo.GalleryDetails;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface GalleryDetailsMapper extends Mapper<GalleryDetails>{

    @Select("select * from gallery_details where gallery_id = #{gId}")
    @Results({
            @Result(property = "name",column = "name"),
            @Result(property = "image",column = "image"),
            @Result(property = "client",column = "client"),
            @Result(property = "note",column = "note"),
            @Result(property = "location",column = "location"),
            @Result(property = "date",column = "date"),
            @Result(property = "categories",column = "categories"),
    })
    List<GalleryDetails> findGalleryDetailsById(String gId);
}
