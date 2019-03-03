package com.gao.dept;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootConfiguration
public class configbeans {
    @Bean
    public Docket api() {
        return new Docket (DocumentationType.SWAGGER_2).apiInfo (apiInfo ()).select ()
                // 自行修改为自己的包路径
                .apis (RequestHandlerSelectors.basePackage ("com.gao.dept.controller")).paths (PathSelectors.any ()).build ();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder ().title ("swagger-api文档").description ("swagger接入教程")
                //服务条款网址
                .termsOfServiceUrl ("https://blog.csdn.net/ysk_xh_521").version ("1.0").contact (new Contact ("Y.S.K", "http://ysk521.cn", "1176971130@qq.com")).build ();
    }

}
