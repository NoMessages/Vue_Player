package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-09-15:47
    @group by cloud-boot-graduation-prod
    @date 2020/7/9 - 15:47
    
*/

import fatcats.top.dao.RepoGoodsDao;
import fatcats.top.domain.RepoGoods;
import fatcats.top.service.RepoGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class RepoGoodsServiceImpl implements RepoGoodsService {
    @Resource
    private RepoGoodsDao repoGoodsDao;
    @Override
    public RepoGoods findRGoodsByID(Integer id) {
        return repoGoodsDao.findRGoodsByID(id);
    }

    @Override
    public Integer findGoodsAll() {
        return repoGoodsDao.findGoodsAll();
    }
}
