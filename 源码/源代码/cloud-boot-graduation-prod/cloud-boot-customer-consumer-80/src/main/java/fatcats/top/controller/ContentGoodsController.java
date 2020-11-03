package fatcats.top.controller;

import fatcats.top.domain.*;
import fatcats.top.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/*
    @author JiangHua
    @create 2020-07-02-16:49
    @group by cloud-boot-graduation-prod
    @date 2020/7/2 - 16:49
*/
@Controller
public class ContentGoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsTypeService goodsTypeService;
    @Autowired
    private PanyGoodsService panyGoodsService;
    @Autowired
    private CarGoodsService carGoodsService;
    @Autowired
    private FastGoodsService fastGoodsService;
    @Autowired
    private UserPowerService userPowerService;
    @GetMapping("/goods-content")
    public String mOrder(Model model){
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
        }
        model.addAttribute("allGoods",allGoods);
        //2.商品类型表所有信息
        List<GoodsType> allType = goodsTypeService.findAllType();
        model.addAttribute("allType",allType);
        //3.商家表所有信息
        List<PanyGoods> allPany = panyGoodsService.findAllPany();
        model.addAttribute("allPany",allPany);
        //4.物流表所有信息
        List<CarGoods> allCar = carGoodsService.findAllCar();
        model.addAttribute("allCar",allCar);
        //5.促销表所有信息
        List<FastGoods> allFast = fastGoodsService.findAllFast();
        model.addAttribute("allFast",allFast);
        //6.权限表详细信息
        List<UserPower> allPower = userPowerService.findAllPower();
        model.addAttribute("allPower",allPower);

        return "con-goods/list.html";
    }
}
