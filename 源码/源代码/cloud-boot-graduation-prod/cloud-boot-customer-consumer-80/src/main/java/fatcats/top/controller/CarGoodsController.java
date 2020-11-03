package fatcats.top.controller;

import fatcats.top.domain.CarGoods;
import fatcats.top.service.CarGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

/*

    @author JiangHua
    @create 2020-07-06-20:39
    @group by cloud-boot-graduation-prod
    @date 2020/7/6 - 20:39
    
*/
@Controller
public class CarGoodsController {

    @Autowired
    private CarGoodsService carGoodsService;

    @GetMapping("/goods-car")
    public String getCar(Model model){
        List<CarGoods> allCar = carGoodsService.findAllCar();
        model.addAttribute("allCar",allCar);
        return "car-goods/list.html";
    }

    @GetMapping("/goods-car/add")
    public String addCarsGoods(){
        return "car-goods/add.html";
    }

    @PostMapping("/goods-car/add")
    public String addGoods(CarGoods carGoods){
        carGoodsService.addCarGoods(carGoods);
        return "redirect:/goods-car";
    }

    @GetMapping("/goods-car/edit/{id}")
    public String editCars(@PathVariable("id") Integer id , Model model){
        CarGoods goods = carGoodsService.findNameByID(id);
        model.addAttribute("car",goods);
        return "car-goods/edit.html";
    }

    @PutMapping("/goods-car/edit")
    public String putGoods(CarGoods carGoods){
        carGoodsService.uptCarGoods(carGoods);
        return "redirect:/goods-car";
    }

    @GetMapping("/goods-car/del/{id}")
    public String delGoods(@PathVariable("id") Integer id){
        carGoodsService.delCarGoods(id);
        return "redirect:/goods-car";
    }

}
