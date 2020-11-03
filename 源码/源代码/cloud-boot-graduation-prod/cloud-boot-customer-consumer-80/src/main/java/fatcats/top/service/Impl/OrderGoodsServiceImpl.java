package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-17-16:00
    @group by cloud-boot-graduation-prod
    @date 2020/7/17 - 16:00
    
*/

import fatcats.top.dao.OrderDao;
import fatcats.top.domain.OrderGoods;
import fatcats.top.service.OrderGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderGoodsServiceImpl implements OrderGoodsService {
    //dao
    @Resource
    private OrderDao orderDao;

    @Override
    public List<OrderGoods> findAllOrder() {
        return orderDao.findAllOrder();
    }

    @Override
    public List<OrderGoods> findS0() {
        return orderDao.findS0();
    }

    @Override
    public List<OrderGoods> findS1() {
        return orderDao.findS1();
    }

    @Override
    public void uptOrder(Integer id) {
            orderDao.uptOrder(id);
    }
}
