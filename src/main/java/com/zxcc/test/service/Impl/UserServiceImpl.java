package com.zxcc.test.service.Impl;

import com.zxcc.test.mapper.UserMapper;
import com.zxcc.test.model.User;
import com.zxcc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

   @Autowired
   private UserMapper userMapper;

    @Override
    public User getInfo(String name, String password) {


        return userMapper.getInfo(name,password);
    }
}
