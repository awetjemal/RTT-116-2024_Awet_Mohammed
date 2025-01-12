package com.example.glab_309_6_1.myservices;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}

