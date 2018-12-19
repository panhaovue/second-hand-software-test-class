package cn.edu.hrbeu.secondhandsoftwaretestclass.controller;

import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.Commodity;
import cn.edu.hrbeu.secondhandsoftwaretestclass.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommodityController {
    @Autowired
    CommodityService commodityService;

    @RequestMapping("/queryCommodity")
    public String queryCommodityHtml(){
        return "queryCommodity";
    }


    @RequestMapping("/queryCommodity/search")
    public String queryCommodity(String commodityName){

        List<Commodity> commodityList = commodityService.findCommodity(commodityName);
        return "success";
    }
}