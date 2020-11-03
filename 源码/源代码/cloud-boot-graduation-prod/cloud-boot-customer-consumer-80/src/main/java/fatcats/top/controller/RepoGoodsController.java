package fatcats.top.controller;

import fatcats.top.domain.Goods;
import fatcats.top.domain.RepoGoods;
import fatcats.top.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/*

    @author JiangHua
    @create 2020-07-02-16:46
    @group by cloud-boot-graduation-prod
    @date 2020/7/2 - 16:46
    
*/
@Controller
public class RepoGoodsController {

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsTypeService goodsTypeService;
    @Autowired
    private PanyGoodsService panyGoodsService;
    @Autowired
    private CarGoodsService carGoodsService;
    @Autowired
    private RepoGoodsService repoGoodsService;

    @GetMapping("/goods-repo")
    public String getPage(Model model){
        //查询商品的信息
        //1.商品表所有信息
        List<Goods> allGoods = goodsService.findAllGoods();
        //处理所有VO类商品
        for (Goods allGood : allGoods) {
            //1.根据ID查询公司ID
            allGood.setPany_name(panyGoodsService.findPanyByID(allGood.getGoods_company()).getPany_name());
            //2.根据商品分类ID查询描述
            allGood.setType_name(goodsTypeService.findTypeByID(allGood.getGoods_catagory()).getType_name());
            //3.根据物流ID查询物流描述
            allGood.setCar_name(carGoodsService.findNameByID(allGood.getGoods_car()).getCar_name());
            RepoGoods repogoods = repoGoodsService.findRGoodsByID(allGood.getGoods_id());
            if(repogoods != null){
                allGood.setRepo_num(repogoods.getRepo_num());
            }else{
                allGood.setRepo_num(0);
            }
        }
        model.addAttribute("allGoods",allGoods);
        return "repo-goods/list.html";
    }
}
