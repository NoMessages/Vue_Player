package fatcats.top;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

    @author JiangHua
    @create 2020-07-06-16:25
    @group by cloud-boot-graduation-prod
    @date 2020/7/6 - 16:25
    
*/
@SpringBootTest
public class ShoppingOrderTests {
    @Autowired
    DataSource dataSource;

    @Test
    public void test() throws SQLException {
        System.out.println("==========="+dataSource.getConnection());

    }

    @Test
    public void tests() throws ParseException {
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "2020-07-12 13:22:32";
        String str2 = "2020-07-16 22:32:12";
        String str3 = "2020-07-12 13:22:32";
        Date format = dateFormat.parse(str);
        Date format2 = dateFormat.parse(str2);
        Date format3 = dateFormat.parse(dateFormat.format(System.currentTimeMillis()).toString());
        System.out.println(format.before(format2));
        System.out.println(format3.after(format2));
    }
}
