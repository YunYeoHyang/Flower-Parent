package com.flower.service;

import com.flower.dao.ProductMapper;
import com.flower.pojo.Product;
import com.flower.vo.OneSkuResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class SkuService {

    @Resource
    private ProductMapper productMapper;

    /**
     * 商品详情页面
     * @param sku
     * @return
     */
    public OneSkuResult findSkuById(Integer sku){

        // 新建一个 OneSkuResult 对象
        OneSkuResult skuResult = new OneSkuResult();

        // 根据sku查找ProductDetails类
        Product productDetails = productMapper.selectBySku(sku);

        /**  2.
         * 赋值
         */
        //id
        skuResult.setId(productDetails.getId());
        // skuId;
        skuResult.setSku(productDetails.getSku());
        // 商品名称
        skuResult.setName(productDetails.getName());
        // 价格
        skuResult.setPrice(productDetails.getPrice());
        // 图片
        skuResult.setImage(productDetails.getImage());

        /**  3.
         * 返回结果
         */
        return skuResult;
    }
}