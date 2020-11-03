package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-08-14:31
    @group by cloud-boot-graduation-prod
    @date 2020/7/8 - 14:31
    
*/

import fatcats.top.domain.CoGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoGoodsService {

    //根据商品ID查询所有的评论
    public List<CoGoods> findCoByID(@Param("id") Integer id);
    //根据ID删除评论
    public void delCoByID(@Param("id") Integer id);
}
