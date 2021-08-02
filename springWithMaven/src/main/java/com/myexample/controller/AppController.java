package com.myexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${app.message}")
    private String appMessage;

    @Value("${INTEGRATION_MYAPP:Nothing}")//export an enviroment variable, with default value: Nothing
    private String integrationEnviromentVariable;

    @GetMapping("/app")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/enviromentVariable")
    public String getIntegrationEnviromentVariable() {
        return integrationEnviromentVariable;
    }
}
