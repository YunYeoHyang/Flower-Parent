package com.flower.controller;

import com.flower.service.SkuService;
import com.flower.vo.OneSkuResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class SkuController {

    @Resource
    private SkuService skuService;

    @GetMapping("/goods/{sku}")
    public ResponseEntity<Object> findSkuById(@PathVariable("sku") Integer sku){
        OneSkuResult sku1 = skuService.findSkuById(sku);

        return ResponseEntity.ok(sku1);
    }
}
