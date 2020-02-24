package com.lsc.blog.service;

import com.lsc.blog.po.User;

/**
 * @Description
 * @auther ValarMorghulis
 * @create 2020-01-15 10:30
 **/
public interface UserService {

    User checkUser(String username, String password);

}
