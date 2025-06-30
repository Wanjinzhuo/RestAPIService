package org.wanjinzhuo.restapidemoforapitesting.cucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.*;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = "cucumber.glue",
        value = "org.wanjinzhuo.restapidemoforapitesting.cucumber.steps,org.wanjinzhuo.restapidemoforapitesting.cucumber.config"
)
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty,html:build/cucumber-reports.html,json:build/cucumber.json")
@CucumberContextConfiguration
@SpringBootTest
public class CucumberTestRunner {
}
// 多个glue路径需分开设置，不能用冒号分隔