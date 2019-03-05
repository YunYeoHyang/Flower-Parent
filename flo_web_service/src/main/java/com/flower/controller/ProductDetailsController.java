package com.flower.controller;

import com.flower.service.ProductDetailsService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class ProductDetailsController {

    @Resource
    private ProductDetailsService productDetailsService;

    /**
     * 根据pid获取ProductDetails
     * @param sku
     * @return
     */
    @RequestMapping("findProductDetails/{sku}")
    public ResponseEntity<Object> findAll(@PathVariable("sku") Integer sku){
        return ResponseEntity.ok( new BaseResult(0 , "成功").append("product" , productDetailsService.findById(sku)));
    }
}
