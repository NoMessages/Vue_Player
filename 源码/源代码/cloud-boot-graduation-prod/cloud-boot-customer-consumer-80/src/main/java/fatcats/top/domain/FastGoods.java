package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-07-23:42
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 23:42
    
*/

import java.io.Serializable;

public class FastGoods implements Serializable {

    private String fast_up;
    private String fast_down;
    private Integer fast_num;
    private Integer fast_repo;
    private Integer fast_price;
    private Integer fast_id;
    private Integer fast_show;
    private String goods_name;
    private Integer goods_price;

    public Integer getFast_id() {
        return fast_id;
    }

    public void setFast_id(Integer fast_id) {
        this.fast_id = fast_id;
    }

    public Integer getFast_show() {
        return fast_show;
    }

    public void setFast_show(Integer fast_show) {
        this.fast_show = fast_show;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Integer getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Integer goods_price) {
        this.goods_price = goods_price;
    }

    public String getFast_up() {
        return fast_up;
    }

    public void setFast_up(String fast_up) {
        this.fast_up = fast_up;
    }

    public String getFast_down() {
        return fast_down;
    }

    public void setFast_down(String fast_down) {
        this.fast_down = fast_down;
    }

    public Integer getFast_num() {
        return fast_num;
    }

    public void setFast_num(Integer fast_num) {
        this.fast_num = fast_num;
    }

    public Integer getFast_repo() {
        return fast_repo;
    }

    public void setFast_repo(Integer fast_repo) {
        this.fast_repo = fast_repo;
    }

    public Integer getFast_price() {
        return fast_price;
    }

    public void setFast_price(Integer fast_price) {
        this.fast_price = fast_price;
    }

    @Override
    public String toString() {
        return "FastGoods{" +
                "fast_up='" + fast_up + '\'' +
                ", fast_down='" + fast_down + '\'' +
                ", fast_num=" + fast_num +
                ", fast_repo=" + fast_repo +
                ", fast_price=" + fast_price +
                ", fast_id=" + fast_id +
                ", fast_show=" + fast_show +
                ", goods_name='" + goods_name + '\'' +
                ", goods_price=" + goods_price +
                '}';
    }
}
