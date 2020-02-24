package com.lsc.blog.dao;

import com.lsc.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 * @auther ValarMorghulis
 * @create 2020-01-15 10:34
 **/
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
