package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.Filter;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.example.demo"})
public class DemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    /**
     * jar启动
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);
        // Banner.Mode是一个枚举类，有CONSOLE,LOG,OFF
//        application.setBannerMode(Banner.Mode.OFF);// 关闭启动Banner
//        application.setBannerMode(Banner.Mode.CONSOLE);// 输出Banner到控制台，默认打印位置
//        application.setBannerMode(Banner.Mode.LOG);// 输出Banner到日志中
        application.run(args);
        logger.info("程序启动成功！");
    }
    @Bean
    public Filter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        config.addExposedHeader("x-auth-token");
        config.addExposedHeader("x-total-count");
        source.registerCorsConfiguration("/**",config);
        return new CorsFilter(source);
    }
}
