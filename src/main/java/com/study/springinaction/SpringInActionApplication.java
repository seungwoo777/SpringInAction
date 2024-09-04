package com.study.springinaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication은 DeComplied 구성을 보면 다음과 같이 결합
 * 1. @SpringBootConfiguration : 현재 클래스를 구성 클래스로 지정 필요하다면 자바 기반의 스프링 프레임워크 구성을 현재 클래스에 추가 할 수 있음.(이 어노테이션은 @Configuration 어노테이션의 특화된 형태)
 * 2. @EnabledAutoConfiguration : 스프링 부트 자동 구성을 활성화
 * 3. @ComponentScan : 컴포넌트 검색을 활성화 함 ** 이것은 @Component, @Controller, @Service 등의 애노테이션과 함께 클래스를 선언 할 수 있게 해줌 그러면 스프링은 자동으로 그런 클래스를 찾아 스프링 어플리케이션 컨텍스트에 등록**
 */
@SpringBootApplication // 스프링부트 애플리케이션 어노테이션
public class SpringInActionApplication {

    /**
     * main 메소드
     * 1. JAR파일이 실행될 때 호출되어 실행되는 메소드
     * 2. main 메소드는 실제로 애플리케이션을 시작시키고 스프링 애플리케이션 컨텍스트를 생성하는 SpringApplication 클래스의 run()메소드를 호출
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringInActionApplication.class, args); // 애플리케이션 실행 run()에 두개의 매개변수는 구성클래스(SpringInActionApplication.class)와 명령행 인자(args)
    }

}
