package com.flower.controller;

import com.flower.pojo.GalleryDetails;
import com.flower.service.GalleryDetailsService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping()
public class GalleryDetailsController {

    @Resource
    private GalleryDetailsService galleryDetailsService;

    /**
     * 根据条件查询所有gallery
     * @return
     */
    @PostMapping("/findGalleryDetailsById/{id}")
    public ResponseEntity<Object> findGalleryDetailsById(@PathVariable("id") String gId){

        List<GalleryDetails> gallery = galleryDetailsService.findGalleryDetailsById(gId);

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("gallery" , gallery));
    }
}
