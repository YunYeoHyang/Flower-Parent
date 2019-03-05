package com.flower.service;

import com.flower.dao.ProductDetailsMapper;
import com.flower.dao.ProductReviewsMapper;
import com.flower.dao.UserMapper;
import com.flower.pojo.ProductReviews;
import com.flower.pojo.User;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductReviewsService {

    @Resource
    private ProductReviewsMapper productReviewsMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private ProductDetailsMapper productDetailsMapper;

    /**
     * 添加商品评论
     * @param productReviews
     * @return
     */
    public Integer addProductReviews(ProductReviews productReviews){

        return productReviewsMapper.insert(productReviews);
    }

    /**
     * 查询所有
     * @return
     */
    public List<ProductReviews> findAllReviews(Integer pid){

        List<ProductReviews> productReviews = productReviewsMapper.selectByPid(pid);
        for (ProductReviews p :
                productReviews) {
            p.setUser(userMapper.selectByPrimaryKey(p.getUid()));
            p.setProductDetails(productDetailsMapper.selectByPrimaryKey(p.getPid()));
        }

        return productReviews;
    }
}
