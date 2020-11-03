package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-08-14:28
    @group by cloud-boot-graduation-prod
    @date 2020/7/8 - 14:28
    
*/

import java.io.Serializable;

public class CoGoods implements Serializable {


    //SELECT co_ids , co_content , co_time , co_uname , co_addr , co_id FROM tb_gds_co
    private Integer co_ids;
    private String co_content;
    private String co_time;
    private String co_uname;
    private String co_addr;
    private Integer co_id;

    public Integer getCo_ids() {
        return co_ids;
    }

    public void setCo_ids(Integer co_ids) {
        this.co_ids = co_ids;
    }

    public String getCo_content() {
        return co_content;
    }

    public void setCo_content(String co_content) {
        this.co_content = co_content;
    }

    public String getCo_time() {
        return co_time;
    }

    public void setCo_time(String co_time) {
        this.co_time = co_time;
    }

    public String getCo_uname() {
        return co_uname;
    }

    public void setCo_uname(String co_uname) {
        this.co_uname = co_uname;
    }

    public String getCo_addr() {
        return co_addr;
    }

    public void setCo_addr(String co_addr) {
        this.co_addr = co_addr;
    }

    public Integer getCo_id() {
        return co_id;
    }

    public void setCo_id(Integer co_id) {
        this.co_id = co_id;
    }

    @Override
    public String toString() {
        return "CoGoods{" +
                "co_ids=" + co_ids +
                ", co_content='" + co_content + '\'' +
                ", co_time='" + co_time + '\'' +
                ", co_uname='" + co_uname + '\'' +
                ", co_addr='" + co_addr + '\'' +
                ", co_id=" + co_id +
                '}';
    }
}
