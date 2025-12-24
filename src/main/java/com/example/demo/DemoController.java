package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping
    public Map<String, String> get() {
        return Map.of(
                "method", "GET",
                "message", "GET request successful"
        );
    }

    @PostMapping
    public Map<String, Object> post(@RequestBody Map<String, Object> body) {
        return Map.of(
                "method", "POST",
                "receivedBody", body
        );
    }

    @PutMapping
    public Map<String, String> put() {
        return Map.of(
                "method", "PUT",
                "message", "PUT request successful"
        );
    }

    @PatchMapping
    public Map<String, String> patch() {
        return Map.of(
                "method", "PATCH",
                "message", "PATCH request successful"
        );
    }

    @DeleteMapping
    public Map<String, String> delete() {
        return Map.of(
                "method", "DELETE",
                "message", "DELETE request successful"
        );
    }
}
