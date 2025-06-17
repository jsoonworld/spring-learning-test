package cholog.bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBean {
    public String hello() {
        return "Hello";
    }
}
