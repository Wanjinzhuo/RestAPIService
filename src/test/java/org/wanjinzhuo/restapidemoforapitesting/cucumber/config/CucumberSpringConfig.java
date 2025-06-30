package org.wanjinzhuo.restapidemoforapitesting.cucumber.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest
public class CucumberSpringConfig {
    // 启用默认的Spring Boot测试上下文
}