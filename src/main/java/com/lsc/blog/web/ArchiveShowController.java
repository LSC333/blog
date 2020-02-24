package com.lsc.blog.web;

import com.lsc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @auther ValarMorghulis
 * @create 2020-01-22 13:11
 **/
@Controller
public class ArchiveShowController {

    @Autowired
    private BlogService blogService;


    @GetMapping("/archives")
    public String archives(Model model){
        model.addAttribute("archiveMap", blogService.archiveBlog());
        model.addAttribute("blogCount", blogService.countBlog());
        return "archives";
    }

}
