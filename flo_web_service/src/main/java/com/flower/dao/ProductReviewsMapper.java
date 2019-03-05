package com.flower.dao;

import com.flower.pojo.ProductReviews;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ProductReviewsMapper extends Mapper<ProductReviews> {

    @Select("select * from product_reviews where pid = #{pid}")
    List<ProductReviews> selectByPid(Integer pid);
}
