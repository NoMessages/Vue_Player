package fatcats.top.service.Impl;

import fatcats.top.dao.UserAccountDao;
import fatcats.top.domain.UserAccount;
import fatcats.top.service.UserAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*

    @author JiangHua
    @create 2020-07-07-11:41
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 11:41
    
*/
@Service
public class UserAccountServiceImpl implements UserAccountService {
   @Resource
   private UserAccountDao userAccountDao;

    @Override
    public List<UserAccount> findAllUser() {
        return userAccountDao.findAllUser();
    }

    @Override
    public UserAccount findUserByName(String user_name) {
        return userAccountDao.findUserByName(user_name);
    }

    @Override
    public void addUser(UserAccount userAccount) {
        userAccountDao.addUser(userAccount);
    }

    @Override
    public void delUserByID(Integer id) {
        userAccountDao.delUserByID(id);
    }

    @Override
    public void uptUserByID(UserAccount userAccount) {
        userAccountDao.uptUserByID(userAccount);
    }

    @Override
    public UserAccount findUserByID(Integer id) {
        return userAccountDao.findUserByID(id);
    }
}
