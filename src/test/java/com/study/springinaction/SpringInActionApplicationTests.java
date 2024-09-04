package com.study.springinaction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // 스프링 부트 기능 테스트를 시작하라는 것을 JUnit에 알려줌
class SpringInActionApplicationTests {


    /**
     * void로 선언된 contextLoads()함수에 실행 코드가 없는데도 실행 하는 이유
     * 1. 테스트클래스로 인해 스프링 애플리케이션 컨텍스트가 성공적으로 로드될 수 있는지 확인하는 기본적인 검사를 수행하기 위해서
     * 2. @SpringBootTest어노테이션이 작업을 수행하게 되어 스프링 애플리케이션 컨텍스트가 로드 되는 지
     */
    @Test
    void contextLoads() {
    }

}
