package cn.edu.hrbeu.secondhandsoftwaretestclass.controller;


import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.User;
import cn.edu.hrbeu.secondhandsoftwaretestclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class OtherUserInformationController {



    @Autowired
    UserService userService;

    @RequestMapping("/userInformation")
    public String userInformationHTML(){
        return "userInformation";
    }

    @GetMapping("/otherUserInformation")
    public String otherUserInformation(HttpSession session,User user){
        User otherUser= userService.findUserByUserId(user.getUserId());
        session.setAttribute("otherUser",otherUser);
        return "redirect:userInformation";
    }

}
