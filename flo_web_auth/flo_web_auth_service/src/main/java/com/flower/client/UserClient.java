package com.flower.client;

import com.flower.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("web-service")
// @Component
public interface UserClient {
    @GetMapping("query")
    ResponseEntity<User> queryUser(@RequestParam("phone") String phone,
                                   @RequestParam("password") String password);
}
