package fatcats.top.controller;

import fatcats.top.domain.*;
import fatcats.top.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*

    @author JiangHua
    @create 2020-07-02-15:32
    @group by cloud-boot-graduation-prod
    @date 2020/7/2 - 15:32
    
*/
@Controller
public class ShopGoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsTypeService goodsTypeService;
    @Autowired
    private PanyGoodsService panyGoodsService;
    @Autowired
    private CarGoodsService carGoodsService;
    @Autowired
    private CoGoodsService coGoodsService;
    @GetMapping("/goods-shop")
    public String findAllOrder(Model model){
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
        return "shop-goods/list.html";
    }


    //修改用户
    @GetMapping("/goods-shop/edit/{id}")
    public String editUser(@PathVariable("id") Integer id , Model model){
            /*
            修改商品
            1. 需要回写  公司名称 商品分类 商品所属物流
            2. 需要回写用户信息 ID
           */
            Goods goods = goodsService.findGoodsByID(id);
            System.out.println("editGoods--FindGoods"+goods);
            //1.type_name
            goods.setType_name(goodsTypeService.findTypeByID(goods.getGoods_catagory()).getType_name());
            //2.设置pany_name
            goods.setPany_name(panyGoodsService.findPanyByID(goods.getGoods_company()).getPany_name());
            //3.设置所属物流
            goods.setCar_name(carGoodsService.findNameByID(goods.getGoods_car()).getCar_name());
        //4.设置所有能操作的选项
        findAll(model);
        model.addAttribute("goods",goods);
        return "shop-goods/edit.html";
    }

    //修改商品信息
    @PutMapping("/goods-shop/edit")
    public String editUser(Goods goods){
        System.out.println("editGoods---Goods"+goods);
        goodsService.editGoods(goods);
        return "redirect:/goods-shop";
    }

    //添加商品页面
    @GetMapping("/goods-shop/add")
    public String addPage(Model model){
        findAll(model);
        return "shop-goods/add.html";
    }

    @PostMapping("/goods-shop/add")
    public String addUser(Goods goods){
        System.out.println("==============AddGoods--Goods"+goods);
        goodsService.addGoods(goods);
        return "redirect:/goods-shop";
    }
     /*
        删除功能
     */
    @GetMapping("/goods-shop/del/{id}")
    public String delUser(@PathVariable("id") Integer id){
        goodsService.delGoodsByID(id);
        return "redirect:/goods-shop";
    }

    //查看详情
    @GetMapping("/goods-shop/cat/{id}")
    public String catInfo(@PathVariable("id") Integer id , Model model){
        //1.商品的评论信息
        //2.商品的详细信息
        //3.对于评论的删除和管理
        Goods goods = goodsService.findGoodsByID(id);
        System.out.println("editGoods--FindGoods"+goods);
        //1.type_name
        goods.setType_name(goodsTypeService.findTypeByID(goods.getGoods_catagory()).getType_name());
        //2.设置pany_name
        goods.setPany_name(panyGoodsService.findPanyByID(goods.getGoods_company()).getPany_name());
        //3.设置所属物流
        goods.setCar_name(carGoodsService.findNameByID(goods.getGoods_car()).getCar_name());
        model.addAttribute("goods",goods);
        //4.评论查询
        List<CoGoods> comments = coGoodsService.findCoByID(goods.getGoods_id());
        model.addAttribute("comments",comments);
        return "shop-goods/info.html";
    }




public void findAll(Model model){
    List<GoodsType> allType = goodsTypeService.findAllType();
    List<PanyGoods> allPany = panyGoodsService.findAllPany();
    List<CarGoods> allCar = carGoodsService.findAllCar();
    model.addAttribute("allType",allType);
    model.addAttribute("allPany",allPany);
    model.addAttribute("allCar",allCar);
}
















































//    /*
//        查看
//     */
//    @GetMapping("/orders/cat/{id}")
//    public String catOrder(@PathVariable("id") Integer id , Model model){
//        PaymentOrder payment = orderPaymentService.findOrderByID(id);
//        model.addAttribute("payment",payment);
//        return "order/fix.html";
//    }
//
//     /*
//           修改 orders/edit
//     */
//
//    @GetMapping("/orders/edit/{id}")
//    public String editOrder(@PathVariable("id") Integer id , Model model){
//        PaymentOrder payment = orderPaymentService.findOrderByID(id);
//        System.out.println("=================== orderPayment"+payment);
//        model.addAttribute("payment",payment);
//        return "order/fix.html";
//    }
//
//    /*
//        提交
//     */
//
//    @PutMapping("/orders/edit")
//    public String edit_putOrder(PaymentOrder paymentOrder){
//        orderPaymentService.updateOrder(paymentOrder);
//        return "redirect:/orders";
//    }
//
//    @PostMapping("/orders/edit")
//    public String addOrder(PaymentOrder paymentOrder){
//        orderPaymentService.addPaymenOrder(paymentOrder);
//        return "redirect:/orders";
//    }
//
//    /*
//
//        添加订单
//
//     */
//
//    @GetMapping("/orders/add")
//    public String addOrder(){
//        return "order/add.html";
//    }
//
//
//    /*
//
//        添加
//
//     */
//    @PostMapping("/orders/add")
//    public String add_PostOrder(PaymentOrder paymentOrder){
//        paymentOrder.setPayment_sale(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
//        orderPaymentService.addPaymenOrder(paymentOrder);
//        return "redirect:/orders";
//    }
//
//    @DeleteMapping("/orders/{id}")
//    public String deleteOrder(@PathVariable("id") Integer id){
//        orderPaymentService.deleteOrder(id);
//        return "redirect:/orders";
//    }
}
