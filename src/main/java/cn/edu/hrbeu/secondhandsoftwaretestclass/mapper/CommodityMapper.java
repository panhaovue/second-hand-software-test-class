package cn.edu.hrbeu.secondhandsoftwaretestclass.mapper;

import cn.edu.hrbeu.secondhandsoftwaretestclass.bean.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommodityMapper {

    @Select("SELECT * FROM commodity " +
            "WHERE commodity_name LIKE '%${commodityName}%'")
    public List<Commodity> findCommodity(Commodity commodity);



    @Select("SELECT * FROM commodity LIMIT 9")
    public List<Commodity> find9FirstCommodity();
}
