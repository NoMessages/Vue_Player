package fatcats.top.controller;

import fatcats.top.service.OrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*

    @author JiangHua
    @create 2020-07-02-16:20
    @group by cloud-boot-graduation-prod
    @date 2020/7/2 - 16:20
    
*/
@Controller
public class OrderGoodsControler {
    @Autowired
    private OrderGoodsService orderGoodsService;

    @GetMapping("/goods-order")
    public String getGoods(Model model){
        //查询并且分类
        model.addAttribute("S0",orderGoodsService.findS0());
        model.addAttribute("S1",orderGoodsService.findS1());
        model.addAttribute("allOrder",orderGoodsService.findAllOrder());
        return "order-goods/list.html";
    }

    @GetMapping("/goods-order/fix/{id}")
    public String fixGoods(@PathVariable("id") Integer id){
        orderGoodsService.uptOrder(id);
        return "redirect:/goods-order";

    }










































//    //删除功能
//    @DeleteMapping("/goods/{id}")
//    public String deleteGoods(@PathVariable("id") Integer id){
//            goodsService.deleteGoodsByID(id);
//        return "redirect:/goods";
//    }
//
//    //编辑商品信息
//    @GetMapping("/goods/modify/{id}")
//    public String recatInfo(@PathVariable("id") Integer id , Model model){
//        PaymentGoods goods = goodsService.findGoodsyID(id);
//        model.addAttribute("goods",goods);
//        return "goods/fix.html";
//    }
//
//    @GetMapping("/goods/add")
//    public String show_shop(){
//        return "goods/add.html";
//    }
//
//    @PostMapping("/goods/add")
//    public String addGoods(PaymentGoods paymentGoods){
//            goodsService.addGoods(paymentGoods);
//        System.out.println("==============paymentGoods"+paymentGoods);
//        return "redirect:/goods";
//    }
}
