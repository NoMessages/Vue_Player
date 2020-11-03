package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-07-23:44
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:44
    
*/

import fatcats.top.domain.FastGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FastGoodsService {

    //查询所有的促销商品
    public List<FastGoods> findAllFast();
    //根据分类查询
    public List<FastGoods> findShow0();
    //根据分类查询1
    public List<FastGoods> findShow1();
    //根据分类查询1
    public List<FastGoods> findShow2();
    //新增促销商品
    public void insertFastGoods(FastGoods fastGoods);
    //更新日期商品
    public void uptFastGoodsByID(FastGoods fastGoods);
}
