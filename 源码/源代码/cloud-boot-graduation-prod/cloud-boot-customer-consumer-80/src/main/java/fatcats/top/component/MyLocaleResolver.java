package fatcats.top.component;
/*

    @author JiangHua
    @create 2020-07-02-20:50
    @group by cloud-boot-graduation-prod
    @date 2020/7/2 - 20:50
    
*/

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        Locale locale = null;
        locale = Locale.getDefault();
        String l = httpServletRequest.getParameter("l");
        if(!StringUtils.isEmpty(l)){
            String[] splite = l.split("_");
            locale = new Locale(splite[0],splite[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
