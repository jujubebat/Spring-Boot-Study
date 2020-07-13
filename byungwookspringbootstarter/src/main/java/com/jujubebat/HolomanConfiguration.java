package com.jujubebat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// holoman 빈을 return 하는 설정 파일
// resources/META-INF/spring.factories에 이 설정 파일을 명시해주면
// 스프링 부트 Enable auto Configuration이 이 설정 파일을 읽는다.
@Configuration
public class HolomanConfiguration {

    @Bean
    public Holoman holoman(){
        Holoman holoman = new Holoman();
        holoman.setHowLong(5);
        holoman.setName("ByungWook");
        return holoman;
    }
}
