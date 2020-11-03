package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-09-15:46
    @group by cloud-boot-graduation-prod
    @date 2020/7/9 - 15:46
    
*/

import fatcats.top.domain.RepoGoods;
import org.apache.ibatis.annotations.Param;

public interface RepoGoodsService {

    //根据商品ID查询库存数量
    public RepoGoods findRGoodsByID(@Param("id") Integer id);
    //查询所有
    public Integer findGoodsAll();

}
