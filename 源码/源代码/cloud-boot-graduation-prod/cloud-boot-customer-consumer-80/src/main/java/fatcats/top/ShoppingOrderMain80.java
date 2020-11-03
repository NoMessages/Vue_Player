package fatcats.top;
/*

    @author JiangHua
    @create 2020-07-01-14:35
    @group by cloud-boot-graduation-prod
    @date 2020/7/1 - 14:35
    
*/

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fatcats.top.dao")
public class ShoppingOrderMain80 {

        public static void main(String[] args){
            SpringApplication.run(ShoppingOrderMain80.class,args);
        }

}
