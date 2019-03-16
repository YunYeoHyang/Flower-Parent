package com.flower.service;

import com.flower.pojo.User;
import com.flower.dao.UserMapper;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 注册保存用户信息
     * @param user
     * @return
     */
    public void saveUser(User user){

        // 默认添加头像
        user.setFace("assets/images/blog/comment/2.jpg");

        // 添加User
        userMapper.insert(user);
    }

    /**
     * 通过手机号查询对应User类
     * @param phone
     * @return
     */
    public User findByMobile(String phone) {

        // 创建 Example
        Example example = new Example(User.class);

        // 匹配条件
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("phone" , phone);

        // 返回
        return this.userMapper.selectOneByExample( example );
    }
}