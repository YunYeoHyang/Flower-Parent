package com.flower.controller;

import com.flower.pojo.Tebs;
import com.flower.service.TebService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class TebController {

    @Resource
    private TebService tebService;

    /**
     * 查询所有标签
     * @return
     */
    @RequestMapping("findAllTeb")
    public ResponseEntity<Object> findAll(){

        List<Tebs> tebs = tebService.findAllTebs();

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("teb" , tebs));
    }
}
