package cn.edu.hrbeu.secondhandsoftwaretestclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping("/fail")
    public String errorHTML(){
        return "fail";
    }
}
