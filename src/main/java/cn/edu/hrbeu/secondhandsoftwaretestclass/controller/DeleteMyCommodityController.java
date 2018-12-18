package cn.edu.hrbeu.secondhandsoftwaretestclass.controller;

import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.Commodity;
import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.User;
import cn.edu.hrbeu.secondhandsoftwaretestclass.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DeleteMyCommodityController {


    @Autowired
    CommodityService commodityService;

    @RequestMapping("/deleteMyCommodity")
    public String deleteMyCommodity(HttpSession session,Commodity commodity){
        User user = (User) session.getAttribute("user");
        if (user.getUserId() != commodity.getUserId()){
            //用户与卖家不匹配
            return "fail";
        }
        commodityService.deleteCommodity(commodity);
        return "redirect:myCommodity";
    }

}
