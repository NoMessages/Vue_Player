package fatcats.top.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*

    @author JiangHua
    @create 2020-07-06-8:25
    @group by cloud-boot-graduation-prod
    @date 2020/7/6 - 8:25
    
*/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
}
