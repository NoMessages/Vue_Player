package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-07-21:01
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 21:01
    
*/

import fatcats.top.domain.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsService {


    //查询所有商品
    public List<Goods> findAllGoods();
    //根据ID查询商品
    public Goods findGoodsByID(@Param("id") Integer id);
    //新增商品
    public void addGoods(Goods goods);
    //删除商品
    public void delGoodsByID(@Param("id") Integer id);
    //修改商品
    public void editGoods(Goods goods);

}
