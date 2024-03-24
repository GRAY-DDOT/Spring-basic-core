package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core",
        //탐색할 패키지의 시작 위치 지정
        //다수는 {"hello.core", "hello.service"}
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
//원래/일반적으로 설정 정보 등을 컴포넌트 스캔 대상에서 빼지는 않는다.
//AppConfig, TestConfig 등 이미 만든 Config 정보들을 유지하며 실습하기 위해 남긴 것이라 함
//@Configuration 이 컴포넌트 스캔의 대상이 된 이유 => @Configuration 내부에 @Component 어노테이션 태그가 붙어있기 때문
public class AutoAppConfig {
}
