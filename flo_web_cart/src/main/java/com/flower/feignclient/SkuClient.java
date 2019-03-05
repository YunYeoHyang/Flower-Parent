package com.flower.feignclient;

import com.flower.vo.OneSkuResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="web-service")
@RequestMapping
public interface SkuClient {
    @GetMapping("/goods/{sku}")
    ResponseEntity<OneSkuResult> querySkuBySku(@PathVariable("sku") Integer sku);
}
