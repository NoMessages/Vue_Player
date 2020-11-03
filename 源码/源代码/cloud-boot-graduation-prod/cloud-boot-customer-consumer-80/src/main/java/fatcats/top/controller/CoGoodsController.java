package fatcats.top.controller;

import fatcats.top.service.CoGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;

/*

    @author JiangHua
    @create 2020-07-09-12:32
    @group by cloud-boot-graduation-prod
    @date 2020/7/9 - 12:32
    
*/
@Controller
public class CoGoodsController {
    @Autowired
    private CoGoodsService coGoodsService;

    //根据评论ID删除评论
    @GetMapping("/goods-co/del/{cid}/{uid}")
    public String del(@PathVariable("cid") Integer cid,@PathVariable("uid") Integer uid){
//        coGoodsService.delCoByID(id[0]);
        System.out.println("uid==="+uid +"cid====="+cid);
        return "redirect:/goods-shop/cat/"+uid;
    };


}
