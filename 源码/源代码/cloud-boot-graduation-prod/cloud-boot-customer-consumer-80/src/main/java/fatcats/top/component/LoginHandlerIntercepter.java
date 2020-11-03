package fatcats.top.component;
/*

    @author JiangHua
    @create 2020-07-01-14:53
    @group by cloud-boot-graduation-prod
    @date 2020/7/1 - 14:53
    
*/

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerIntercepter implements HandlerInterceptor {

        //拦截器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截器判断
        String login_user = (String) request.getSession().getAttribute("loginuser");

        if (login_user == null) {
            request.setAttribute("errormsg","请先登录噢！");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }

            return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
