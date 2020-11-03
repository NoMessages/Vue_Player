package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-07-23:35
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:35
    
*/

import fatcats.top.domain.CarGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarGoodsService {

    //查询所有物流
    public List<CarGoods> findAllCar();

    CarGoods findNameByID(@Param("id") Integer id);

    //更新物流操作
    public void uptCarGoods(CarGoods carGoods);
    //删除物流操作
    public void delCarGoods(@Param("id") Integer id);
    //添加
    public void addCarGoods(CarGoods carGoods);
}
