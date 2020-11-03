package fatcats.top.controller;

import fatcats.top.domain.UserAccount;
import fatcats.top.entities.PaymentUser;
import fatcats.top.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/*

    @author JiangHua
    @create 2020-07-02-10:55
    @group by cloud-boot-graduation-prod
    @date 2020/7/2 - 10:55
    
*/
@Controller
public class UserLoginController {

    @Resource
    private UserAccountService loginService;

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String , Object> map, HttpSession session){

        UserAccount userAccount = loginService.findUserByName(username);
        System.out.println("=============="+userAccount);
        if (!StringUtils.isEmpty(userAccount) && userAccount.getUser_pwd().equals(password)) {
            if(userAccount.getUser_power() == 2){
                //登录成功 转发 视图解析器走 templates 默认文件夹
                session.setAttribute("loginuser",userAccount.getUser_name());
                return "redirect:/main.html";
            }else{
                //登录失败
                map.put("errormsg","没有权限！!");
                return "login";
            }
        }else{
            //登录失败
            map.put("errormsg","用户名或密码错误!!");
            return "login";
        }

    }

    /*
        退出登录
     */
    @GetMapping("/signout")
    public String sign_out(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().removeAttribute("loginuser");
        return "redirect:/login.html";
    }
}
