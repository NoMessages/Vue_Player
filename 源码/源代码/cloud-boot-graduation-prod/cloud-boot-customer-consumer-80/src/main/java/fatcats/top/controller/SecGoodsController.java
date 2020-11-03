package fatcats.top.controller;

import fatcats.top.domain.UserAccount;
import fatcats.top.domain.UserPower;
import fatcats.top.service.UserAccountService;
import fatcats.top.service.UserPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*

    @author JiangHua
    @create 2020-07-06-20:39
    @group by cloud-boot-graduation-prod
    @date 2020/7/6 - 20:39
    
*/
@Controller
public class SecGoodsController {
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private UserPowerService userPowerService;
    @GetMapping("/goods-sec")
    public String getSec(Model model){
        //查询所有的登录管理账号着
        List<UserAccount> allUser = userAccountService.findAllUser();
        model.addAttribute("allUser",allUser);
        return "sec-goods/list.html";
    }

    //修改用户
    @GetMapping("/goods-sec/edit/{id}")
    public String editUser(@PathVariable("id") Integer id , Model model){
            /*
            修改用户
            1. 权限表需要查询 用户id 姓名 密码 电话 权限
            2. 回写用户信息 ID
           */
        UserAccount user = userAccountService.findUserByID(id);
        System.out.println("editUser--FindUser"+user);
        List<UserPower> allPower = userPowerService.findAllPower();
        model.addAttribute("allPower",allPower);
        model.addAttribute("user",user);
        return "sec-goods/edit.html";
    }

    //修改用户信息
    @PutMapping("/goods-sec/edit")
    public String editUser(UserAccount account){
        System.out.println("editUser---UserAccount"+account);
        userAccountService.uptUserByID(account);
        return "redirect:/goods-sec";
    }

    //添加页面
    @GetMapping("/goods-sec/add")
    public String addPage(Model model){
        List<UserPower> allPower = userPowerService.findAllPower();
        model.addAttribute("allPower",allPower);
        return "sec-goods/add.html";
    }

    @PostMapping("/goods-sec/add")
    public String addUser(UserAccount userAccount){
        System.out.println("==============AddUser--userAccount"+userAccount);
        userAccountService.addUser(userAccount);
        return "redirect:/goods-sec";
    }
    /*
        删除功能
     */
    @GetMapping("/goods-sec/del/{id}")
    public String delUser(@PathVariable("id") Integer id){
        userAccountService.delUserByID(id);
        return "redirect:/goods-sec";
    }

}
