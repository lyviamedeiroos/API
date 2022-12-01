package com.sistemafaculdade.api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Component
@Configuration //para informar que é uma classe de configuração
@EnableSwagger2 //faz parter da configuração do swagger
public class SwaggerConfig implements WebMvcConfigurer { //implementa o pacote webmvc do spring web que o swagger precisa
    @Bean // para o spring gerenciar a classe de uma lib externa
    public Docket api(){ //config padrão
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() { //config os titulos da nossa app
        return new ApiInfoBuilder()
                .title("Cadastro de alunos")
                .description("Sistema para a realização do cadastro dos alunos de uma faculdade")
                .version("1.0.0")
                .build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html") // a pagina do nosso swagger
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/"); //classes java compiladas estarão nesse local
    }






















}
