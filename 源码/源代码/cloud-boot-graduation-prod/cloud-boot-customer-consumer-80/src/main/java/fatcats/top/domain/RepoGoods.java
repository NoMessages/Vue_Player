package fatcats.top.domain;
/*

    @author JiangHua
    @create 2020-07-09-15:45
    @group by cloud-boot-graduation-prod
    @date 2020/7/9 - 15:45
    
*/

import java.io.Serializable;

public class RepoGoods implements Serializable {

    private Integer repo_id;
    private Integer repo_num;


    public Integer getRepo_id() {
        return repo_id;
    }

    public void setRepo_id(Integer repo_id) {
        this.repo_id = repo_id;
    }

    public Integer getRepo_num() {
        return repo_num;
    }

    public void setRepo_num(Integer repo_num) {
        this.repo_num = repo_num;
    }


    @Override
    public String toString() {
        return "RepoGoods{" +
                "repo_id=" + repo_id +
                ", repo_num=" + repo_num +
                '}';
    }
}
