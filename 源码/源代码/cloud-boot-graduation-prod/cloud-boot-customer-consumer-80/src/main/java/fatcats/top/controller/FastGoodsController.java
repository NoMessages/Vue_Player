package fatcats.top.controller;

import fatcats.top.domain.FastGoods;
import fatcats.top.domain.Goods;
import fatcats.top.service.FastGoodsService;
import fatcats.top.service.GoodsService;
import fatcats.top.service.GoodsTypeService;
import fatcats.top.service.RepoGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.testng.annotations.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*

    @author JiangHua
    @create 2020-07-02-16:42
    @group by cloud-boot-graduation-prod
    @date 2020/7/2 - 16:42
    
*/
@Controller
public class FastGoodsController {

    @Autowired
    private FastGoodsService fastGoodsService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private RepoGoodsService repoGoodsService;
    @Autowired
    private GoodsTypeService goodsTypeService;
    @GetMapping("/goods-fast")
    public String findAllService(Model model) throws ParseException {
        List<FastGoods> allFast = fastGoodsService.findAllFast();
        List<FastGoods> Fast0 = new ArrayList<>();
        List<FastGoods> Fast1 = new ArrayList<>();
        List<FastGoods> Fast2 = new ArrayList<>();
        Date format = null;
        Date format2 = null;
        Date format3 = null;
        boolean isMove = false;
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (FastGoods fastGoods : allFast) {

            format = dateFormat.parse(fastGoods.getFast_up());
            format2 = dateFormat.parse(fastGoods.getFast_down());
            format3 = dateFormat.parse(dateFormat.format(System.currentTimeMillis()).toString());

            Goods goods = goodsService.findGoodsByID(fastGoods.getFast_id());
            //1.原价
            fastGoods.setGoods_price(goods.getGoods_price());
            //2.名称
            fastGoods.setGoods_name(goods.getGoods_name());
            //3.库存
            fastGoods.setFast_num(repoGoodsService.findRGoodsByID(fastGoods.getFast_id()) == null?0:repoGoodsService.findRGoodsByID(fastGoods.getFast_id()).getRepo_num());

            if(format3.before(format)){
                fastGoods.setFast_show(0);
                isMove = true;
            }
            if(format3.after(format)){
                if(format3.before(format2)){
                    fastGoods.setFast_show(1);
                    isMove = true;
                }
            }
            if(format3.after(format2)){
                fastGoods.setFast_show(2);
                isMove = true;
            }
            //判断是否有变更
            if(isMove)
            fastGoodsService.uptFastGoodsByID(fastGoods);
            if(fastGoods.getFast_show() == 0)
                Fast0.add(fastGoods);
            if(fastGoods.getFast_show() == 1)
                Fast1.add(fastGoods);
            if(fastGoods.getFast_show() == 2)
                Fast2.add(fastGoods);
        }
        model.addAttribute("allFast",allFast);
        model.addAttribute("Fast0",Fast0);
        model.addAttribute("Fast1",Fast1);
        model.addAttribute("Fast2",Fast2);
        return "fast-goods/list.html";
    }

    //添加界面
    @GetMapping("/goods-fast/add")
    public String getPageAdd(Model model, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*"); //  这里最好明确的写允许的域名
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token,Authorization,ybg");
        //需要知道什么？
        //1.所有商品
        List<Goods> allGoods = goodsService.findAllGoods();
        model.addAttribute("allGoods",allGoods);

        return "fast-goods/add.html";
    }

    @GetMapping("/goods-fast/select/{id}")
    @ResponseBody
    public Goods findByGoods(@PathVariable("id") Integer id){
        Goods goods = goodsService.findGoodsByID(id);
        goods.setRepo_num(repoGoodsService.findRGoodsByID(goods.getGoods_id()) == null?0:repoGoodsService.findRGoodsByID(goods.getGoods_id()).getRepo_num());
        goods.setType_name(goodsTypeService.findTypeByID(goods.getGoods_catagory()).getType_name());
        return goods;
    }

    //新增
    @PostMapping("/goods-fast/add")
    public String getGoods(FastGoods fastGoods) throws ParseException {
        //show应该如何判定
//        fastGoods.setFast_show();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date format = dateFormat.parse(fastGoods.getFast_up());
        Date format2 = dateFormat.parse(fastGoods.getFast_down());
        Date format3 = dateFormat.parse(dateFormat.format(System.currentTimeMillis()).toString());

        if(format3.before(format)){
            fastGoods.setFast_show(0);
        }
        if(format3.after(format)){
            if(format3.before(format2)){
                fastGoods.setFast_show(1);
            }
        }
        if(format3.after(format2)){
            fastGoods.setFast_show(2);
        }
        System.out.println("fasasfasfasfasfasf==========="+fastGoods);
        fastGoodsService.insertFastGoods(fastGoods);


        return "redirect:/goods-fast";
    }
































//
//    @DeleteMapping("/users/{id}")
//    public String deleteUser(@PathVariable("id") Integer id){
//        userSelfService.deleteUserByID(id);
//        //删除完毕跳转到list界面
//        return "redirect:/users";
//    }
//
//    @GetMapping("/users/add")
//    public String addUser(Model model){
//            //这里可以处理一些动态资源，比如说一些定义好的个性语言
//        Collection<IntrduceInstance> my_list = new ArrayList<IntrduceInstance>();
//        my_list.add(new IntrduceInstance("这个人不懒，但是还是什么也没留下"));
//        my_list.add(new IntrduceInstance("这个人很懒，什么也没留下"));
//        my_list.add(new IntrduceInstance("这个人比较懒，什么都也没留下"));
//        my_list.add(new IntrduceInstance("这个人特别懒，什么都不想留下"));
//        model.addAttribute("list",my_list);
//        return "user/add.html";
//    }
//
//    @PostMapping("/users/add")//新增用户提交
//    public String true_addUser(PaymentUser paymentUser){
//        userSelfService.addUser(paymentUser);
//        return "redirect:/users";
//    }
//
//    //回写方法
//    @GetMapping("/users/fix/{id}")
//    public String fixUsersMethod(@PathVariable("id") Integer id,Model model){
//        System.out.println("---------------------------"+id);
//        PaymentUser user = userSelfService.findUserByID(id);
//        System.out.println("==============11111111111111111111"+user);
//        Collection<IntrduceInstance> my_list = new ArrayList<IntrduceInstance>();
//        my_list.add(new IntrduceInstance("这个人不懒，但是还是什么也没留下"));
//        my_list.add(new IntrduceInstance("这个人很懒，什么也没留下"));
//        my_list.add(new IntrduceInstance("这个人比较懒，什么都也没留下"));
//        my_list.add(new IntrduceInstance("这个人特别懒，什么都不想留下"));
//        model.addAttribute("list",my_list);
//        model.addAttribute("user",user);
//        return "user/fix.html";
//    }
//
//    @PutMapping("/users/fix")
//    public String fixUser(PaymentUser paymentUser){
//        System.out.println("================="+paymentUser);
//            userSelfService.updateUser(paymentUser);
//        return "redirect:/users";
//    }

}
