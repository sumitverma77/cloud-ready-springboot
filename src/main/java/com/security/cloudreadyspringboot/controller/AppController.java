package com.security.cloudreadyspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class AppController {

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        log.info("Received /health request");
        return ResponseEntity.ok("Health Status : OK");
    }

    @GetMapping("/info")
    public ResponseEntity<Map<String, String>> info() {
        log.info("Received /info request");
        Map<String, String> details = new HashMap<>();
        details.put("app", "cloud-ready-springboot");
        details.put("version", "1.0.0");
        details.put("status", "running");
        return ResponseEntity.ok(details);
    }

    @PostMapping("/echo")
    public ResponseEntity<Map<String, Object>> echo(@RequestBody Map<String, Object> input) {
        log.info("Received /echo request with body: {}", input);
        return ResponseEntity.ok(input);
    }
    @GetMapping("/cicd-test")
    public ResponseEntity<String> testDeployment() {
        return ResponseEntity.ok("CI/CD deployment is working successfully!");
    }
}
