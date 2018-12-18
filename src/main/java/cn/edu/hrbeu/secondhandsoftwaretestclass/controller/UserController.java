package cn.edu.hrbeu.secondhandsoftwaretestclass.controller;

import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.User;
import cn.edu.hrbeu.secondhandsoftwaretestclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/userInformation")
    public String userInformationHTML(){
        return "userInformation";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user1 , HttpSession session){

        User user=(User)session.getAttribute("user");

        user1.setUserPower(user.getUserPower());
        user1.setUserId(user.getUserId());
        userService.updateUserByUserId(user1);
        session.setAttribute("user",user1);
        return "redirect:userInformation";

    }
}
