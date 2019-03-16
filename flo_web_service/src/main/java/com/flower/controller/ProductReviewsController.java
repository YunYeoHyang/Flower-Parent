package com.flower.controller;

import com.flower.pojo.ProductReviews;
import com.flower.service.ProductReviewsService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class ProductReviewsController {

    @Resource
    private ProductReviewsService productReviewsService;

    /**
     * 添加商品评论
     * @param productReviews
     * @return
     */
    @PostMapping("/addReviews")
    private ResponseEntity<Object> addReviews(@RequestBody ProductReviews productReviews){

        productReviewsService.addProductReviews(productReviews);

        return ResponseEntity.ok( new BaseResult(0 , "成功"));
    }

    /**
     * 查询所有评论
     * @return
     */
    @PostMapping("/findByPid/{pid}")
    private ResponseEntity<Object> findByPid(@PathVariable("pid") Integer pid){

        List<ProductReviews> allReviews = productReviewsService.findAllReviews(pid);

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("allReviews" , allReviews));

    }
}