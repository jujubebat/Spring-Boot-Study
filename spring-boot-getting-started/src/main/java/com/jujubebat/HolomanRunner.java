package com.jujubebat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HolomanRunner implements ApplicationRunner {
    // 스프링 부트 애플리케이션이 만들어지고 실행되었을때 자동으로 실행되는 빈을 만드다.

    @Autowired
    Holoman holoman;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println(holoman);
    }
}
