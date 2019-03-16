package com.flower.controller;

import com.flower.pojo.Gallery;
import com.flower.service.GalleryService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping()
public class GalleryController {

    @Resource
    private GalleryService galleryService;

    /**
     * 查询所有gallery
     * @return
     */
    @GetMapping("/findGallery")
    public ResponseEntity<Object> findAll(){

        List<Gallery> gallery = galleryService.findAllGallery();

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("gallery" , gallery));
    }

    /**
     * 根据条件查询所有gallery
     * @return
     */
    @PostMapping("/findGallerys/{categories}")
    public ResponseEntity<Object> findAllByCategories(@PathVariable("categories") String categories){

        List<Gallery> gallery = galleryService.findGallery(categories);

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("gallery" , gallery));
    }
}
