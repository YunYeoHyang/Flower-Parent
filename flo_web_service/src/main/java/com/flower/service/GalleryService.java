package com.flower.service;

import com.flower.dao.GalleryMapper;
import com.flower.pojo.Gallery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GalleryService {

    @Resource
    private GalleryMapper galleryMapper;


    /**
     * 查询所有
     * @return
     */
    public List<Gallery> findAllGallery() {

        return galleryMapper.selectAll();
    }

    /**
     * 根据Categories查询所有
     * @param categories
     * @return
     */
    public List<Gallery> findGallery(String categories) {
        return galleryMapper.findGalleryByCategories(categories);
    }
}
