package com.lsc.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @Dsecription:
 * @Author: zyl
 * @Date: 2020/3/7 14:31
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @RequestMapping("")
    public String registerPage() {
        return "register";
    }

    @RequestMapping("/check")
    public String check(@RequestParam String nickname, @RequestParam String username,
                        @RequestParam String password, @RequestParam String email,
                        RedirectAttributes attributes) {

        //注册用户代码
        if (false) {

            //注册成功跳转登录页面
            return "admin/login";

        } else {
            //注册失败，返回信息
            attributes.addFlashAttribute("message", "注册失败");
            return "redirect:/register";
        }
    }
}
