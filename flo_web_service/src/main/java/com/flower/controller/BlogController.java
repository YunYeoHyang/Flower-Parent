package com.flower.controller;

import com.flower.pojo.Blogs;
import com.flower.service.BlogService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class BlogController {

    @Resource
    private BlogService blogService;

    /**
     * 查询所有blog
     * @return
     */
    @RequestMapping("findAllBlogs")
    public ResponseEntity<Object> findAll(){

        List<Blogs> allBlog = blogService.findAllBlog();

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("blogs" , allBlog));
    }
}
