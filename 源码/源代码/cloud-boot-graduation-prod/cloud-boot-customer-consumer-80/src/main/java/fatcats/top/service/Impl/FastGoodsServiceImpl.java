package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-07-23:44
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:44
    
*/

import fatcats.top.dao.FastGoodsDao;
import fatcats.top.domain.FastGoods;
import fatcats.top.service.FastGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FastGoodsServiceImpl implements FastGoodsService {
    @Resource
    private FastGoodsDao fastGoodsDao;

    @Override
    public List<FastGoods> findAllFast() {
        return fastGoodsDao.findAllFast();
    }

    @Override
    public List<FastGoods> findShow0() {
        return fastGoodsDao.findShow0();
    }

    @Override
    public List<FastGoods> findShow1() {
        return fastGoodsDao.findShow1();
    }

    @Override
    public List<FastGoods> findShow2() {
        return fastGoodsDao.findShow2();
    }

    @Override
    public void insertFastGoods(FastGoods fastGoods) {
        //新增促销商品
       // public void insertFastGoods(FastGoods fastGoods);
        fastGoodsDao.insertFastGoods(fastGoods);
    }

    @Override
    public void uptFastGoodsByID(FastGoods fastGoods) {
        fastGoodsDao.uptFastGoodsByID(fastGoods);
    }

}
