package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-07-18:32
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 18:32
    
*/

import java.io.Serializable;

public class UserPower implements Serializable {


    private Integer power_id;
    private String power_desc;

    public Integer getPower_id() {
        return power_id;
    }

    public void setPower_id(Integer power_id) {
        this.power_id = power_id;
    }

    public String getPower_desc() {
        return power_desc;
    }

    public void setPower_desc(String power_desc) {
        this.power_desc = power_desc;
    }

    @Override
    public String toString() {
        return "UserPower{" +
                "power_id=" + power_id +
                ", power_desc='" + power_desc + '\'' +
                '}';
    }
}
