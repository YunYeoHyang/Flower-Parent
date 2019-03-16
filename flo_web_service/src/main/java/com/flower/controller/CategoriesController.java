package com.flower.controller;

import com.flower.pojo.Categories;
import com.flower.service.CategoriesService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class CategoriesController {

    @Resource
    private CategoriesService categoriesService;

    /**
     * 查询所有分类
     * @return
     */
    @RequestMapping("findAllCategories")
    public ResponseEntity<Object> findAll(){

        List<Categories> categories = categoriesService.findAllCategories();

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("categories" , categories));
    }
}
