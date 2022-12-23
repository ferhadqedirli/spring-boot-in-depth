package com.example.springboot.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    private final CurrencyServiceConfiguration currencyServiceConfiguration;

    public CurrencyConfigurationController(CurrencyServiceConfiguration currencyServiceConfiguration) {
        this.currencyServiceConfiguration = currencyServiceConfiguration;
    }

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return currencyServiceConfiguration;
    }

}
