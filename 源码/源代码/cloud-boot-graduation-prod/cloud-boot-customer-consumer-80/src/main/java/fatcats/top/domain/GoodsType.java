package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-07-21:25
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 21:25
    
*/

import java.io.Serializable;

public class GoodsType implements Serializable {

    private Integer type_id;
    private String type_name;

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "type_id=" + type_id +
                ", type_name='" + type_name + '\'' +
                '}';
    }
}
