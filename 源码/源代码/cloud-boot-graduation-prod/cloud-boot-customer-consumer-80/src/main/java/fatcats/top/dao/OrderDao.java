package fatcats.top.dao;
/*

    @author JiangHua
    @create 2020-07-17-15:56
    @group by cloud-boot-graduation-prod
    @date 2020/7/17 - 15:56
    
*/

import fatcats.top.domain.OrderGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    //CRUD
    /*
    private Integer or_id;
    private String or_tm;
    private String or_uuid;
    private String or_pany;
    private Double or_money;
    private String or_method;
    private Integer or_status;

     */
    public List<OrderGoods> findAllOrder();
    //查找状态0
    public List<OrderGoods> findS0();
    //查找状态1
    public List<OrderGoods> findS1();
    //修改状态
    public void uptOrder(@Param("id") Integer id);

}
