package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-07-20:53
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 20:53
    
*/

import java.io.Serializable;

public class Goods implements Serializable {


    //SELECT
// goods_id , goods_price ,
// goods_name , goods_star ,
// goods_company , goods_catagory , goods_car
// FROM tb_gds
    private Integer goods_id;
    private Integer goods_price;
    private String goods_name;
    private Integer goods_star;
    private Integer goods_company;
    private Integer goods_catagory;
    private Integer goods_car;

    //物流公司名称
    private String pany_name;
    //物品分类处理
    private String type_name;
    //物流公司名称
    private String car_name;
    //库存数量
    private Integer repo_num;

    public Integer getRepo_num() {
        return repo_num;
    }

    public void setRepo_num(Integer repo_num) {
        this.repo_num = repo_num;
    }

    public String getPany_name() {
        return pany_name;
    }

    public void setPany_name(String pany_name) {
        this.pany_name = pany_name;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Integer goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Integer getGoods_star() {
        return goods_star;
    }

    public void setGoods_star(Integer goods_star) {
        this.goods_star = goods_star;
    }

    public Integer getGoods_company() {
        return goods_company;
    }

    public void setGoods_company(Integer goods_company) {
        this.goods_company = goods_company;
    }

    public Integer getGoods_catagory() {
        return goods_catagory;
    }

    public void setGoods_catagory(Integer goods_catagory) {
        this.goods_catagory = goods_catagory;
    }

    public Integer getGoods_car() {
        return goods_car;
    }

    public void setGoods_car(Integer goods_car) {
        this.goods_car = goods_car;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", goods_price=" + goods_price +
                ", goods_name='" + goods_name + '\'' +
                ", goods_star=" + goods_star +
                ", goods_company=" + goods_company +
                ", goods_catagory=" + goods_catagory +
                ", goods_car=" + goods_car +
                ", pany_name='" + pany_name + '\'' +
                ", type_name='" + type_name + '\'' +
                ", car_name='" + car_name + '\'' +
                ", repo_num=" + repo_num +
                '}';
    }
}
