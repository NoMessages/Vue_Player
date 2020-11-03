package fatcats.top.controller;

import fatcats.top.domain.PanyGoods;
import fatcats.top.service.PanyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*

    @author JiangHua
    @create 2020-07-10-21:59
    @group by cloud-boot-graduation-prod
    @date 2020/7/10 - 21:59
    
*/
@Controller
public class PanyOrderController {
    @Autowired
    private PanyGoodsService panyGoodsService;

    @GetMapping("/goods-pany")
    public String skips(){
        return "pany-goods/add.html";
    }

    @PostMapping("/goods-pany/add")
    public String addPage(PanyGoods panyGoods){
        panyGoodsService.addPany(panyGoods);
        return "redirect:/goods-content";
    }
}
