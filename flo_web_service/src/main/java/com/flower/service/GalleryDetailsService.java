package com.flower.service;

import com.flower.dao.GalleryDetailsMapper;
import com.flower.pojo.GalleryDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GalleryDetailsService {

    @Resource
    private GalleryDetailsMapper galleryDetailsMapper;

    public List<GalleryDetails> findGalleryDetailsById(String gId) {
        return galleryDetailsMapper.findGalleryDetailsById(gId);
    }
}
