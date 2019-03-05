package com.flower.service;

import com.flower.dao.ProductDetailsMapper;
import com.flower.pojo.ProductDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductDetailsService {

    @Resource
    private ProductDetailsMapper productDetailsMapper;

    /**
     * 根据pid查询商品详情
     * @param sku
     * @return
     */
    public ProductDetails findById(Integer sku){
        return productDetailsMapper.findDetailsBySku(sku);
    }
}
