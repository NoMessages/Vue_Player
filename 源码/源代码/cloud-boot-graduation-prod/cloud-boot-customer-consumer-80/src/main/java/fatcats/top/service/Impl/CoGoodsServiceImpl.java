package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-08-14:31
    @group by cloud-boot-graduation-prod
    @date 2020/7/8 - 14:31
    
*/

import fatcats.top.dao.CoGoodsDao;
import fatcats.top.domain.CoGoods;
import fatcats.top.service.CoGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CoGoodsServiceImpl implements CoGoodsService {
    @Resource
    private CoGoodsDao coGoodsDao;
    @Override
    public List<CoGoods> findCoByID(Integer id) {
        return coGoodsDao.findCoByID(id);
    }

    @Override
    public void delCoByID(Integer id) {
        coGoodsDao.delCoByID(id);
    }
}
