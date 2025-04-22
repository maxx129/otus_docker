package com.example.docker_test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping
    public ResponseEntity<Void> health() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
