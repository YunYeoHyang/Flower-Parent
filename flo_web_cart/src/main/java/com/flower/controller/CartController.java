package com.flower.controller;

import com.flower.cart.Cart;
import com.flower.config.JwtProperties;
import com.flower.entity.UserInfo;
import com.flower.service.CartService;
import com.flower.utils.JwtUtils;
import com.flower.vo.BaseResult;
import com.flower.vo.CartRequest;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cart")
@EnableConfigurationProperties({JwtProperties.class})
public class CartController {

    @Resource
    private CartService cartService;

    @Resource
    private HttpServletRequest req;

    @Resource
    private JwtProperties jwtProperties;

    /**
     * 添加购物车
     * @param cartRequest
     * @return
     */
    @PostMapping
    public ResponseEntity<BaseResult> addCart(@RequestBody CartRequest cartRequest) {

        System.out.println("进方法");
        //1校验token
        UserInfo userInfo;
        try {
            String token = req.getHeader("authorization");
            userInfo = JwtUtils.getInfoFromToken(token, jwtProperties.getPublicKey());
        } catch (Exception e) {
            return ResponseEntity.ok( new BaseResult(1 , "失败，没有登录") );
        }

        this.cartService.addCart(userInfo , cartRequest);
        return ResponseEntity.ok( new BaseResult(0 , "成功") );
    }

    /**
     * 登陆后查询购物车
     * @return
     */
    @GetMapping
    public ResponseEntity<Object> queryCartList() {

        //1校验token
        UserInfo userInfo;
        try {
            String token = req.getHeader("Authorization");
            userInfo = JwtUtils.getInfoFromToken(token, jwtProperties.getPublicKey());
        } catch (Exception e) {
            return ResponseEntity.ok( new BaseResult(1 , "失败，没有登录") );
        }

        Cart cart = this.cartService.queryCartList(userInfo);

        return ResponseEntity.ok( new BaseResult( 0 , "成功").append("data" ,cart.getData().values()));
    }

    /**
     * 更新购物车
     * @param cartRequest
     * @return
     */
    @PutMapping
    public ResponseEntity<Object> updateNum(@RequestBody CartRequest cartRequest) {
        // 获取登录用户
        String token = req.getHeader("authorization");

        UserInfo userInfo;
        try {
            userInfo = JwtUtils.getInfoFromToken(token, jwtProperties.getPublicKey());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(new BaseResult(0 , "token无效"));
        }
        this.cartService.updateCart( userInfo, cartRequest);
        return ResponseEntity.ok(new BaseResult(0 , "成功"));
    }

    /**
     * 删除
     * @param sku
     * @return
     */
    @DeleteMapping("/{sku}")
    public ResponseEntity<BaseResult> deleteCart(@PathVariable("sku") Integer sku) {

        //1校验token
        UserInfo userInfo;
        try {
            String token = req.getHeader("Authorization");
            userInfo = JwtUtils.getInfoFromToken(token, jwtProperties.getPublicKey());
        } catch (Exception e) {
            return ResponseEntity.ok( new BaseResult(1 , "失败，没有登录") );
        }

        try {
            this.cartService.deleteCart(userInfo ,sku);

            return ResponseEntity.ok( new BaseResult( 0 , "成功"));
        } catch (Exception e) {
            return ResponseEntity.ok( new BaseResult(1 , e.getMessage()) );
        }
    }
}
