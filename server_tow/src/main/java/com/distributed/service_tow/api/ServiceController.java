package com.distributed.service_tow.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ServiceController {

    @Value("${spring.application.name}")
    private String applicationName;


    @GetMapping("/api")
    public void server(){
        log.info("{} is api",applicationName);
    }
}
