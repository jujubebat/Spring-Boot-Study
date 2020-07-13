package com.jujubebat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    // 이렇게 직접 빈을 등록하면 무시된다.
    // 1단계로 @ComponentScan을 통해 아래 빈이 등록된다.
    // 2단계로 @EnableAutoConfiguration로 빈이 등록된다.
    // byungwookspringbootstarter 프로젝트에서 등록해둔 빈이 등록되면서 아래 빈은 덮어쓰여진다.
    @Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setName("byunwook");
        holoman.setHowLong(50);
        return holoman;
    }
}

/*
[메모]
@SpringBootApplication 애노테이션은 아래 3가지 애노테이션을 포함한다

1. @SpringBootConfiguration
2. @ComponentScan(빈 등록 단계 1)
    2-1. @Compnent, @Configuration, @Service, @Controller, @RestController을 갖는 빈을 등록한다.
3. @EnableAutoConfiguration (빈 등록 단계 2)
    3-1. spring.factories에 명시 되어있는 수 많은 Configuration 빈이 조건에 따라 등록 된다.
*/


