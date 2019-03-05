package com.flower.service;

import com.flower.dao.ProductMapper;
import com.flower.pojo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService {

    @Resource
    private ProductMapper productMapper;




    /**
     * 查询所有商品
     * @return
     */
    public List<Product> findAllProduct(){

        return productMapper.selectAll();
    }
}
