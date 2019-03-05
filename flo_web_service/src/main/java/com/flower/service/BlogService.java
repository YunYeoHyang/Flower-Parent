package com.flower.service;

import com.flower.dao.BlogMapper;
import com.flower.pojo.Blogs;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogService {

    @Resource
    private BlogMapper blogMapper;

    /**
     * 查询所有blog
     * @return
     */
    public List<Blogs> findAllBlog(){

        return blogMapper.selectAll();
    }
}
