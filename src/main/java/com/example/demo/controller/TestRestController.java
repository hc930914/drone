package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: rock
 * @createTime: 2020/11/30 14:41
 */
@RestController
public class TestRestController {

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("test");
    }
}
