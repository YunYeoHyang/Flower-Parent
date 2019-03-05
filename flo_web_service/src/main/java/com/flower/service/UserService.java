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

        user.setFace("assets/images/blog/comment/2.jpg");
        userMapper.insert(user);
    }

    public User findByMobile(String phone) {

        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("phone" , phone);
        return this.userMapper.selectOneByExample( example );
    }

    public User findUser(String phone) {

        Example example = new Example(User.class);

        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("phone", phone);

        User u = userMapper.selectOneByExample(example);
        return u;
    }
}