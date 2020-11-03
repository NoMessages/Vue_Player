package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-07-21:28
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 21:28
    
*/

import fatcats.top.dao.GoodsTypeDao;
import fatcats.top.domain.GoodsType;
import fatcats.top.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    private GoodsTypeDao goodsTypeDao;
    @Override
    public List<GoodsType> findAllType() {
        return goodsTypeDao.findAllType();
    }

    @Override
    public GoodsType findTypeByID(Integer id) {
        return goodsTypeDao.findTypeByID(id);
    }

    @Override
    public void insType(GoodsType goodsType) {
        goodsTypeDao.insType(goodsType);
    }
}
