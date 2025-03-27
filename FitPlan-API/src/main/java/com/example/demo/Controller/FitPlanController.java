package com.example.demo.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class FitPlanController {

    @GetMapping("/fitplan/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("{\"message\": \"Welcome to FitPlan!\"}");

    }
}