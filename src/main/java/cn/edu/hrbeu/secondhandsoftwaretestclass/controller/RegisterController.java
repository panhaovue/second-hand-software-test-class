package cn.edu.hrbeu.secondhandsoftwaretestclass.controller;

import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.User;
import cn.edu.hrbeu.secondhandsoftwaretestclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public String registerHtml(){
        return "register";
    }

    @PostMapping("/register/try")
    public String register(User user){
        //查询手机号，学号是否重复
        User user1 = userService.findUserByPhoneAndStudentId(user);
        if (user1 == null){
            userService.insertUser(user);
            return "success";
        }
        else {
            return "fail";
        }
    }
}
