package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-07-11:40
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 11:40
    
*/

import fatcats.top.domain.UserAccount;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAccountService {


    //查询所有用户
    public List<UserAccount> findAllUser();
    //根据用户名查询用户
    public UserAccount findUserByName(@Param("user_name") String user_name);
    //新增用户
    public void addUser(UserAccount userAccount);
    //删除用户
    public void delUserByID(@Param("user_id") Integer id);
    //修改用户
    public void uptUserByID(UserAccount userAccount);
    //根据用户ID查询用户
    public UserAccount findUserByID(@Param("user_id") Integer id);
}
