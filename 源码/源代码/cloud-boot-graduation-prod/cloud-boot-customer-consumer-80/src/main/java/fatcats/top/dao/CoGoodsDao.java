package fatcats.top.dao;
/*

    @author JiangHua
    @create 2020-07-08-14:30
    @group by cloud-boot-graduation-prod
    @date 2020/7/8 - 14:30
    
*/

import fatcats.top.domain.CoGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoGoodsDao {


    //根据商品ID查询所有的评论
    public List<CoGoods> findCoByID(@Param("id") Integer id);

    //根据ID删除评论
    public void delCoByID(@Param("id") Integer id);
}
