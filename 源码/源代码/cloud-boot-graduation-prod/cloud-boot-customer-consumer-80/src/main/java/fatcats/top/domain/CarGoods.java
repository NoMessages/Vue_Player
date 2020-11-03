package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-07-23:32
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:32
    
*/

import java.io.Serializable;

public class CarGoods implements Serializable {

    private Integer car_id;
    private String car_name;
    private String car_method;

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_method() {
        return car_method;
    }

    public void setCar_method(String car_method) {
        this.car_method = car_method;
    }

    @Override
    public String toString() {
        return "CarGoods{" +
                "car_id=" + car_id +
                ", car_name='" + car_name + '\'' +
                ", car_method='" + car_method + '\'' +
                '}';
    }
}
