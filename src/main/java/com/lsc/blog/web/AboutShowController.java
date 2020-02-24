package com.lsc.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @auther ValarMorghulis
 * @create 2020-01-22 15:19
 **/
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about(){
        return "about";
    }

}
