package cn.edu.hrbeu.secondhandsoftwaretestclass.controller;

import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.Commodity;
import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.User;
import cn.edu.hrbeu.secondhandsoftwaretestclass.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UpdateMyCommodityController {

@Autowired
    CommodityService commodityService;

    @RequestMapping("/updateMyCommodity")
    public String updateMyCommodityHTML(HttpServletRequest httpServletRequest,HttpSession session){
        User user = (User) session.getAttribute("user");
        Integer commodityId = Integer.valueOf(httpServletRequest.getParameter("commodityId"));
        System.out.println(commodityId);
        Commodity commodity = commodityService.findCommodityByCommodityId(commodityId);
        if (user == null||user.getUserId() != commodity.getUserId()){
            //未登录或不是卖家
            return "fail";
        }
        session.setAttribute("commodity",commodity);
        return "updateMyCommodity";
    }

    @RequestMapping("/updateMyCommodity/try")
    public String updateMyCommodity(Commodity commodity){
        commodityService.updateCommodity(commodity);
        return "redirect:../myCommodity";
    }

//    @InitBinder
//    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//    }
}
