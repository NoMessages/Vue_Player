package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-07-21:01
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 21:01
    
*/

import fatcats.top.dao.GoodsDao;
import fatcats.top.domain.Goods;
import fatcats.top.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<Goods> findAllGoods() {
        return goodsDao.findAllGoods();
    }

    @Override
    public Goods findGoodsByID(Integer id) {
        return goodsDao.findGoodsByID(id);
    }

    @Override
    public void addGoods(Goods goods) {
        goodsDao.addGoods(goods);
    }

    @Override
    public void delGoodsByID(Integer id) {
        goodsDao.delGoodsByID(id);
    }

    @Override
    public void editGoods(Goods goods) {
        goodsDao.editGoods(goods);
    }
}
