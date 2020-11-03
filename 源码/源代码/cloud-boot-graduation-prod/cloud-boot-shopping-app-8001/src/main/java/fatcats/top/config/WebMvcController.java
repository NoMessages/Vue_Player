package fatcats.top.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*

    @author JiangHua
    @create 2020-07-01-14:42
    @group by cloud-boot-graduation-prod
    @date 2020/7/1 - 14:42
    
*/
@Configuration
public class WebMvcController implements WebMvcConfigurer {
    /*
        拦截器：addViewController addInterport
     */

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//            registry.addViewController("/demo").setViewName("success");
//    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //拦截器
//        registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**")
//                .excludePathPatterns("/index.html","/","/user/login","/static/**","/webjars/**","/asserts/**");
//    }
    @Bean
    public WebMvcConfigurer webMvcConfiguration(){

        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index"); //这是让所有的/请求都跳转到login登录界面
                registry.addViewController("/index.html").setViewName("index"); //让默认的index.html跳转到login界面
                registry.addViewController("/category.html").setViewName("category"); //让默认的index.html跳转到login界面


            }
        };
        return webMvcConfigurer;
    }


}
