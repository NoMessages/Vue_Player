package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-07-21:34
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 21:34
    
*/

import java.io.Serializable;

public class PanyGoods implements Serializable {

    //pany_id , pany_name , pany_desc , pany_type
    private Integer pany_id;
    private String pany_name;
    private String pany_desc;
    private String pany_type;

    public Integer getPany_id() {
        return pany_id;
    }

    public void setPany_id(Integer pany_id) {
        this.pany_id = pany_id;
    }

    public String getPany_name() {
        return pany_name;
    }

    public void setPany_name(String pany_name) {
        this.pany_name = pany_name;
    }

    public String getPany_desc() {
        return pany_desc;
    }

    public void setPany_desc(String pany_desc) {
        this.pany_desc = pany_desc;
    }

    public String getPany_type() {
        return pany_type;
    }

    public void setPany_type(String pany_type) {
        this.pany_type = pany_type;
    }

    @Override
    public String toString() {
        return "PanyGoods{" +
                "pany_id=" + pany_id +
                ", pany_name='" + pany_name + '\'' +
                ", pany_desc='" + pany_desc + '\'' +
                ", pany_type='" + pany_type + '\'' +
                '}';
    }
}
