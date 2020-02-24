package com.lsc.blog.service;

import com.lsc.blog.dao.UserRepository;
import com.lsc.blog.po.User;
import com.lsc.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @auther ValarMorghulis
 * @create 2020-01-15 10:32
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User checkUser(String username, String password) {
        User user=userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
