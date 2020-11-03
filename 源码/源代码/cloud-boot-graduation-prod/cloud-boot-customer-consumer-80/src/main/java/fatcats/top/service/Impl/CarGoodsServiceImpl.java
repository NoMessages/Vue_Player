package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-07-23:35
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:35
    
*/

import fatcats.top.dao.CarGoodsDao;
import fatcats.top.domain.CarGoods;
import fatcats.top.service.CarGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CarGoodsServiceImpl implements CarGoodsService {
    @Resource
    private CarGoodsDao carGoodsDao;
    @Override
    public List<CarGoods> findAllCar() {
        return carGoodsDao.findAllCar();
    }

    @Override
    public CarGoods findNameByID(Integer id) {
        return carGoodsDao.findNameByID(id);
    }

    @Override
    public void uptCarGoods(CarGoods carGoods) {
        carGoodsDao.uptCarGoods(carGoods);
    }

    @Override
    public void delCarGoods(Integer id) {
        carGoodsDao.delCarGoods(id);
    }

    @Override
    public void addCarGoods(CarGoods carGoods) {
        carGoodsDao.addCarGoods(carGoods);
    }
}
