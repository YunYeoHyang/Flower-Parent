package com.flower.controller;

import com.flower.pojo.Product;
import com.flower.service.ProductService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class ProductController {

    @Resource
    private ProductService productService;

    /**
     * 查询所有商品
     * @return
     */
    @RequestMapping("findAllProduct")
    public ResponseEntity<Object> findAll(){

        List<Product> allProduct = productService.findAllProduct();

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("allProduct" , allProduct));
    }

}
