package com.example.login;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/api/login")
    public Map<String, String> login(@RequestBody Map<String, String> body) {
        String username = body.getOrDefault("username", "");
        String password = body.getOrDefault("password", "");
        if ("admin".equals(username) && "password".equals(password)) {
            return Map.of("status", "ok");
        }
        return Map.of("status", "error", "message", "Invalid credentials");
    }
}
