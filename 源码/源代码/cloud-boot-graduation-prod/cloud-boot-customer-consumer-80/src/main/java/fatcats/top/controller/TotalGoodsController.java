package fatcats.top.controller;

import fatcats.top.domain.Total;
import fatcats.top.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*

    @author JiangHua
    @create 2020-07-06-20:39
    @group by cloud-boot-graduation-prod
    @date 2020/7/6 - 20:39
    
*/
@Controller
public class TotalGoodsController {

        //商品
    @Autowired
    private GoodsService goodsService;
    //干货
    @Autowired
    private RepoGoodsService repoGoodsService;
    //运营
    @Autowired
    private FastGoodsService fastGoodsService;
    //物流
    @Autowired
    private CarGoodsService carGoodsService;
    //用户
    @Autowired
    private UserAccountService userAccountService;
    @GetMapping("/goods-total")
    public String getTotal(Model model){
        int goods_num = goodsService.findAllGoods().size();
        Integer repo_num = repoGoodsService.findGoodsAll();
        int fast_num = fastGoodsService.findAllFast().size();
        int car_num = carGoodsService.findAllCar().size();
        int usr_num = userAccountService.findAllUser().size();
        Total total = new Total();
        total.setGoods_num(goods_num);
        total.setRepo_num(repo_num);
        total.setFast_num(fast_num);
        total.setCar_num(car_num);
        total.setUsr_num(usr_num);
        model.addAttribute("allSize",total);
        //仓库所有数量
        /*

                             value: data.goods_num,
										name: '商品总量'
									}, {
										value: data.repo_num,
										name: '库存干货总量'
									}, {
										value: data.fast_num,
										name: '促销运营总量'
									}, {
										value: data.car_num,
										name: '物流总量'
									}, {
										value: data.usr_num,
										name: '用户总量'
         */
        System.out.println(total);
        return "total-goods/list.html";
    }
}
