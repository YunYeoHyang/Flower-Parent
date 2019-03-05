package com.flower.controller;

import com.flower.pojo.User;
import com.flower.service.UserService;
import com.flower.vo.BaseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class UserController {

    @Resource
    private UserService userService;


    /**
     * 注册保存用户信息
     * @param user
     * @return
     */
    @PostMapping("/register")
    private ResponseEntity<Object> rigister(@RequestBody User user){

        this.userService.saveUser(user);

        return ResponseEntity.ok( new BaseResult(0 , "注册成功"));
    }

    /**
     * 通过手机号和密码进行查询
     * @param phone
     * @param password
     * @return
     */
    @GetMapping("/query")
    public ResponseEntity<User> queryUser(@RequestParam("phone") String phone , @RequestParam("password") String password){

        // 通过手机号查询用户
        User user = this.userService.findByMobile( phone );

        // 非空判断&密码校验
        if(user == null || !user.getPassword().equals(password)){

            return ResponseEntity.ok( null );
        }

        return ResponseEntity.ok( user );
    }

    @PostMapping("/findUser/{phone}")
    public ResponseEntity<Object> findUser(@PathVariable("phone") String phone ){

        System.out.println(phone);

        User user = this.userService.findUser(phone);

        return ResponseEntity.ok( new BaseResult(0 , "成功").append("user" , user));
    }
}