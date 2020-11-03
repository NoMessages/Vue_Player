package fatcats.top;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

/*

    @author JiangHua
    @create 2020-07-06-16:14
    @group by cloud-boot-graduation-prod
    @date 2020/7/6 - 16:14
    
*/
@SpringBootTest
public class ShoppingTest {
    @Autowired
    DataSource dataSource;


    @Test
    public void contextLoads() throws SQLException {
        System.out.println("==============="+dataSource.getConnection());
//        System.out.println(jdbcTemplate.queryForObject("select * from payment",String.class));
    }
}
