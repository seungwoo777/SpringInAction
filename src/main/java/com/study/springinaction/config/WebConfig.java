package com.study.springinaction.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebConfig는 뷰 컨트롤러의 역할을 수행하는 구성 클래스
 * WebMvcConfigurer 인터페이스 구현 이 인터페이스는 스프링 MVC를 구성하는 메서드를 정의
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // addViewControllers 하나 이상의 뷰 컨트롤러를 등록하기 위해 사용 할 수 있는 ViewControllerRegistry를 인자로 받음
    // 여기서는 우리의 뷰 컨트롤러가  GET 요청을 처리하는 경로인 "/"  인자로 전달 하여  addViewContoller 에 호출 이메서드는 ViewControllerRegistry 객체를 setViewName 을 호출
    // 이렇게 함으로 써 GetMapping("/") viewResolver -> home 이 대체 가능
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}
