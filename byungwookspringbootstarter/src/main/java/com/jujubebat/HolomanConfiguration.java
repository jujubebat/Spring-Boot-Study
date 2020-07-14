package com.jujubebat;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// holoman 빈을 return 하는 설정 파일
// resources/META-INF/spring.factories에 이 설정 파일을 명시해주면
// 스프링 부트 Enable auto Configuration이 이 설정 파일을 읽는다.
@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    @Bean
    @ConditionalOnMissingBean // Holoman 빈이 등록되지 않았을때만 빈을 등록하라는 뜻.
    public Holoman holoman(HolomanProperties properties){
        Holoman holoman = new Holoman();
        holoman.setHowLong(properties.getHowLong());
        holoman.setName(properties.getName());
        return holoman;
    }

}
