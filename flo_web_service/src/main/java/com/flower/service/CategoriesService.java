package com.flower.service;

import com.flower.dao.CategoriesMapper;
import com.flower.pojo.Categories;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoriesService {

    @Resource
    private CategoriesMapper categoriesMapper;

    /**
     * 查询所有分类
     * @return
     */
    public List<Categories> findAllCategories() {

        return categoriesMapper.selectAll();
    }
}
