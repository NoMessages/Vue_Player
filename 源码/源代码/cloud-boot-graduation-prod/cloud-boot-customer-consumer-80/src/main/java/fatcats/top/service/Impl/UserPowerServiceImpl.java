package fatcats.top.service.Impl;
/*

    @author JiangHua
    @create 2020-07-07-19:38
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 19:38
    
*/

import fatcats.top.dao.UserPowerDao;
import fatcats.top.domain.UserPower;
import fatcats.top.service.UserPowerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserPowerServiceImpl implements UserPowerService {
    @Resource
    private UserPowerDao userPowerDao;
    @Override
    public List<UserPower> findAllPower() {
        return userPowerDao.findAllPower();
    }
}
