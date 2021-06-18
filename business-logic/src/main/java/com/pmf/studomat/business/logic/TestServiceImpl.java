package com.pmf.studomat.business.logic;

import org.springframework.stereotype.Service;

@Service
class TestServiceImpl implements TestService {

    @Override
    public String greetings() {
        return "Hello World!";
    }
}
