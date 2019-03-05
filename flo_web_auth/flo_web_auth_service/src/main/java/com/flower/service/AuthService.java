package com.flower.service;

import com.flower.pojo.User;
import com.flower.client.UserClient;
import com.flower.config.JwtProperties;
import com.flower.entity.UserInfo;
import com.flower.utils.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@EnableConfigurationProperties(JwtProperties.class)
public class AuthService {

    @Autowired
    private UserClient userClient;

    @Resource
    private JwtProperties jwtProperties;

    private static final Logger logger = LoggerFactory.getLogger(AuthService.class);

    /**
     * 登录 ， 生成 token
     * @param phone
     * @param password
     * @return
     */
    public String login( String phone , String password ) {

        try {
            // 远程调用查询数据
            ResponseEntity<User> resp = this.userClient.queryUser(phone, password);
            if (!resp.hasBody()) {
                return null;
            }
            // 获取User
            User user = resp.getBody();

            // 生成token
            return JwtUtils.generateToken(new UserInfo( user.getUid() , user.getName() ),
                    jwtProperties.getPrivateKey(), jwtProperties.getExpire());
        } catch (Exception e){
            logger.error("生成token失败，用户名：{}", phone, e);
        }
        return null;
    }
}
