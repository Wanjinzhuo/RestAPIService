package org.wanjinzhuo.restapidemoforapitesting.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CalculatorSteps {

    private final WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    private String urlTemplate; // 用于保存URL模板

    public CalculatorSteps(WebApplicationContext webApplicationContext) {
        this.webApplicationContext = webApplicationContext;
    }

    @Given("I send a GET request to {string}")
    public void i_send_a_get_request_to_with_url(String url) throws Exception {
        this.urlTemplate = url;
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Then("the response should be {string}")
    public void the_response_should_be(String expectedResponse) throws Exception {
        mockMvc.perform(get(urlTemplate))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));
    }

}