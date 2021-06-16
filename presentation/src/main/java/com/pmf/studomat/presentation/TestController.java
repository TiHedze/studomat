package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private TestService testService;

    public TestController(TestService testService)
    {
        this.testService = testService;
    }
    @GetMapping
    public String getTest()
    {
        return this.testService.greetings();
    }
}
