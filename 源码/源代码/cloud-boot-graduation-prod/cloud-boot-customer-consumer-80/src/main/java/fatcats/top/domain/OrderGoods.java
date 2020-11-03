package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-17-15:56
    @group by cloud-boot-graduation-prod
    @date 2020/7/17 - 15:56
    
*/

import java.io.Serializable;

public class OrderGoods implements Serializable {

    /*

				CREATE TABLE tb_order
				(or_id INT PRIMARY KEY ,
				 or_tm VARCHAR(64) NOT NULL ,
				  or_uuid VARCHAR(64) NOT NULL ,
				   or_pany VARCHAR(32) NOT NULL ,
				     or_money DOUBLE NOT NULL ,
				      or_method VARCHAR(32) NOT NULL ,
				      or_status INT NOT NULL  )
     */
    private Integer or_id;
    private String or_tm;
    private String or_uuid;
    private String or_pany;
    private Double or_money;
    private String or_method;
    private Integer or_status;

    @Override
    public String toString() {
        return "OrderGoods{" +
                "or_id=" + or_id +
                ", or_tm='" + or_tm + '\'' +
                ", or_uuid='" + or_uuid + '\'' +
                ", or_pany='" + or_pany + '\'' +
                ", or_money=" + or_money +
                ", or_method='" + or_method + '\'' +
                ", or_status=" + or_status +
                '}';
    }

    public Integer getOr_id() {
        return or_id;
    }

    public void setOr_id(Integer or_id) {
        this.or_id = or_id;
    }

    public String getOr_tm() {
        return or_tm;
    }

    public void setOr_tm(String or_tm) {
        this.or_tm = or_tm;
    }

    public String getOr_uuid() {
        return or_uuid;
    }

    public void setOr_uuid(String or_uuid) {
        this.or_uuid = or_uuid;
    }

    public String getOr_pany() {
        return or_pany;
    }

    public void setOr_pany(String or_pany) {
        this.or_pany = or_pany;
    }

    public Double getOr_money() {
        return or_money;
    }

    public void setOr_money(Double or_money) {
        this.or_money = or_money;
    }

    public String getOr_method() {
        return or_method;
    }

    public void setOr_method(String or_method) {
        this.or_method = or_method;
    }

    public Integer getOr_status() {
        return or_status;
    }

    public void setOr_status(Integer or_status) {
        this.or_status = or_status;
    }
}
