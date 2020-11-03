package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-07-11:42
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 11:42
    
*/

import java.io.Serializable;

public class UserAccount implements Serializable {

    private Integer user_id;
    private String user_name;
    private String user_pwd;
    private String user_phone;
    private Integer user_power;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public Integer getUser_power() {
        return user_power;
    }

    public void setUser_power(Integer user_power) {
        this.user_power = user_power;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_power=" + user_power +
                '}';
    }
}
