package com.example.demo.common.support.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        /**
         * 所有接口统一添加参数
         */
//        Parameter token = new ParameterBuilder()
//                .name("token")
//                .description("授权码")
//                .required(true)
//                .modelRef(new ModelRef("string"))
//                .parameterType("header")
//                .build();
//        List<Parameter> globalParams = new ArrayList<>(1);
//        globalParams.add(token);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))//扫描有注释ApiOperation的类
                .paths(PathSelectors.any())
                .build();
//                .globalOperationParameters(globalParams);
    }

    /**
     * Api描述信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("boot-learn")
                .description("Api 文档")
                .contact(new Contact("guowj","https://github.com/antguo?tab=repositories","973379770@qq.com"))
                .version("1.0.0")
                .build();
    }
}
