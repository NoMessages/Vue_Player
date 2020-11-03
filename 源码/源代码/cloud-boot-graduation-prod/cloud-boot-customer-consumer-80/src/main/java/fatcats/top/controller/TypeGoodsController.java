package fatcats.top.controller;

import fatcats.top.domain.GoodsType;
import fatcats.top.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*

    @author JiangHua
    @create 2020-07-09-13:22
    @group by cloud-boot-graduation-prod
    @date 2020/7/9 - 13:22
    
*/
@Controller
public class TypeGoodsController {
    @Autowired
    private GoodsTypeService goodsTypeService;

    @GetMapping("/goods-type")
    public String addPage(){
        return "type-goods/add.html";
    }

    @PostMapping("/goods-type/add")
    public String addPageC(GoodsType goodsType){
        goodsTypeService.insType(goodsType);
        return "redirect:/goods-content";
    }

}
