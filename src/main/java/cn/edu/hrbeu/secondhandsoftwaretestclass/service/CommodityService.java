package cn.edu.hrbeu.secondhandsoftwaretestclass.service;

import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.Commodity;
import cn.edu.hrbeu.secondhandsoftwaretestclass.mapper.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {
    @Autowired
    CommodityMapper commodityMapper;

    public List<Commodity> findCommodity(String str){
        return commodityMapper.findCommodity(str);
    }


    public List<Commodity> find9FirstCommodity(){
        return commodityMapper.find9FirstCommodity();
    }

    public Commodity findCommodityByCommodityId(Integer commodityId){
        return commodityMapper.findCommodityByCommodityId(commodityId);
    }



}