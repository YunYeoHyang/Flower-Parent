package com.flower.service;

import com.flower.dao.ProductDetailsMapper;
import com.flower.dao.ProductReviewsMapper;
import com.flower.dao.UserMapper;
import com.flower.pojo.ProductReviews;
import org.springframework.stereotype.Service;

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

        // 通用Mapper添加商品评论
        if(productReviews.getStar() == -1){
            productReviews.setStar(0);
        }
        return productReviewsMapper.insert(productReviews);
    }

    /**
     * 查询所有
     * @return
     */
    public List<ProductReviews> findAllReviews(Integer pid){

        // 通过pid查询所有商品评论
        List<ProductReviews> productReviews = productReviewsMapper.selectByPid(pid);

        // 循环遍历 ， 通过外键添加相应实体类
        for (ProductReviews p :
                productReviews) {
            // User类
            p.setUser(userMapper.selectByPrimaryKey(p.getUid()));
            // ProductDetails类
            p.setProductDetails(productDetailsMapper.selectByPrimaryKey(p.getPid()));
        }
        return productReviews;
    }
}
