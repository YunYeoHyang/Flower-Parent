package com.flower.service;

import com.flower.dao.TebMapper;
import com.flower.pojo.Tebs;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TebService {

    @Resource
    private TebMapper tebMapper;


    /**
     * 查询所有标签
     * @return
     */
    public List<Tebs> findAllTebs() {

        return tebMapper.selectAll();
    }
}
