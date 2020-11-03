package fatcats.top.dao;
/*

    @author JiangHua
    @create 2020-07-07-19:36
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 19:36
    
*/

import fatcats.top.domain.UserPower;

import java.util.List;

public interface UserPowerDao {

    //查询所有的权限列表
    public List<UserPower> findAllPower();


}
