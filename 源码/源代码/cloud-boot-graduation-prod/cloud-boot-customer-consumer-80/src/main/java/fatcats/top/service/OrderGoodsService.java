package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-17-16:00
    @group by cloud-boot-graduation-prod
    @date 2020/7/17 - 16:00
    
*/

import fatcats.top.domain.OrderGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderGoodsService {
    public List<OrderGoods> findAllOrder();
    //查找状态0
    public List<OrderGoods> findS0();
    //查找状态1
    public List<OrderGoods> findS1();
    //修改状态
    public void uptOrder(@Param("id") Integer id);
}
