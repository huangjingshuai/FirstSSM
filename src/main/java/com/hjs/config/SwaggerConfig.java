package com.hjs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Package: com.hjs.config
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/12/10 16:33
 */
@WebAppConfiguration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages ="com.hjs.controller")//扫描controller所在的包
public class SwaggerConfig {
  /*@Bean
    public Docket api(){
      return new Docket(DocumentationType.SWAGGER_2)
              .select()
              .apis(RequestHandlerSelectors.any())
              .build()
              .apiInfo(apiInfo());
  }
    private ApiInfo apiInfo(){
    return new ApiInfoBuilder()
            .title("SSM项目接口文档")
            .description("韩剧项目接口测试")
            .version("1.0.0")
            .termsOfServiceUrl("")
            .license("")
            .licenseUrl("")
            .build();
  }*/
  @Bean
  public Docket api(){
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build();
  }
  @Bean
  public RequestMappingInfoHandlerMapping requestMapping(){
    return new RequestMappingHandlerMapping();
  }


}
