package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-17-15:14
    @group by cloud-boot-graduation-prod
    @date 2020/7/17 - 15:14
    
*/

import java.io.Serializable;

public class Total implements Serializable {

    private Integer goods_num;
    private Integer repo_num;
    private Integer fast_num;
    private Integer car_num;
    private Integer usr_num;

    public Integer getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(Integer goods_num) {
        this.goods_num = goods_num;
    }

    public Integer getRepo_num() {
        return repo_num;
    }

    public void setRepo_num(Integer repo_num) {
        this.repo_num = repo_num;
    }

    public Integer getFast_num() {
        return fast_num;
    }

    public void setFast_num(Integer fast_num) {
        this.fast_num = fast_num;
    }

    public Integer getCar_num() {
        return car_num;
    }

    public void setCar_num(Integer car_num) {
        this.car_num = car_num;
    }

    public Integer getUsr_num() {
        return usr_num;
    }

    public void setUsr_num(Integer usr_num) {
        this.usr_num = usr_num;
    }

    @Override
    public String toString() {
        return "Total{" +
                "goods_num=" + goods_num +
                ", repo_num=" + repo_num +
                ", fast_num=" + fast_num +
                ", car_num=" + car_num +
                ", usr_num=" + usr_num +
                '}';
    }


    /*

                             value: data.goods_num,
										name: '商品总量'
									}, {
										value: data.repo_num,
										name: '库存干货总量'
									}, {
										value: data.fast_num,
										name: '促销运营总量'
									}, {
										value: data.car_num,
										name: '物流总量'
									}, {
										value: data.usr_num,
										name: '用户总量'


     */

}
