package fatcats.top.dao;
/*

    @author JiangHua
    @create 2020-07-07-23:43
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:43
    
*/

import fatcats.top.domain.FastGoods;

import java.util.List;

public interface FastGoodsDao {

    //查询所有的促销商品
    public List<FastGoods> findAllFast();
    //根据分类查询
    public List<FastGoods> findShow0();
    //根据分类查询1
    public List<FastGoods> findShow1();
    //根据分类查询2
    public List<FastGoods> findShow2();

    public void insertFastGoods(FastGoods fastGoods);
    //查询
    public void uptFastGoodsByID(FastGoods fastGoods);
}
