package org.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MetaController {
    @GetMapping
    public ResponseEntity<String> meta(){
        return ResponseEntity.ok("running");
    }
}
