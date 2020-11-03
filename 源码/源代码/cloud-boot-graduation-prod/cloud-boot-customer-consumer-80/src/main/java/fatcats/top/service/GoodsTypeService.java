package fatcats.top.service;
/*

    @author JiangHua
    @create 2020-07-07-21:27
    @group by cloud-boot-graduation-prod
    @date 2020/7/7 - 21:27
    
*/

import fatcats.top.domain.GoodsType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsTypeService {

    //查询所有的类型
    public List<GoodsType> findAllType();
    //根据Type_ID查询类型
    public GoodsType findTypeByID(@Param("id") Integer id);
    //插入数据
    public void insType(GoodsType goodsType);
}
