package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-07-23:16
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:16
    
*/

import fatcats.top.domain.PanyGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanyGoodsService {

    //查询所有的商家信息
    public List<PanyGoods> findAllPany();
    //新增商家信息
    public void addPany(PanyGoods panyGoods);
    //修改商家信息
    public void uptPany(PanyGoods panyGoods);
    //删除商家信息
    public void delPany(@Param("id") Integer id);
    //根据ID查询商家信息
    public PanyGoods findPanyByID(@Param("id") Integer id);
}
