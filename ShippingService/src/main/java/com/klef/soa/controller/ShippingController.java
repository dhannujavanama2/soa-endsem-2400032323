package com.klef.soa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @GetMapping("/")
    public ResponseEntity<String> getShipping() {
        return ResponseEntity.ok("Shipping Service is Running");
    }
}