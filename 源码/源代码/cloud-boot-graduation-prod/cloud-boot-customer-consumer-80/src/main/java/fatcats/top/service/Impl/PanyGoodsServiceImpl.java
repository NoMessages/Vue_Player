package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-07-23:20
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:20
    
*/

import fatcats.top.dao.PanyGoodsDao;
import fatcats.top.domain.PanyGoods;
import fatcats.top.service.PanyGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PanyGoodsServiceImpl implements PanyGoodsService {
    @Resource
    private PanyGoodsDao panyGoodsDao;

    @Override
    public List<PanyGoods> findAllPany() {
        return panyGoodsDao.findAllPany();
    }

    @Override
    public void addPany(PanyGoods panyGoods) {
        panyGoodsDao.addPany(panyGoods);
    }

    @Override
    public void uptPany(PanyGoods panyGoods) {
        panyGoodsDao.uptPany(panyGoods);
    }

    @Override
    public void delPany(Integer id) {
        panyGoodsDao.delPany(id);
    }

    @Override
    public PanyGoods findPanyByID(Integer id) {
        return panyGoodsDao.findPanyByID(id);
    }
}
