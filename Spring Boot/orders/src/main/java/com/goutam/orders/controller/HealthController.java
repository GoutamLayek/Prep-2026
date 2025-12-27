package com.goutam.orders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController //marks class as HTTP handler
public class HealthController {

    @GetMapping("/health") // maps GET/health to this method
    public Map<String, String> health() {// Spring converts it to JSON automatically
        return Map.of(
                "status", "UP",
                "service", "order-service"
        );
    }
}
