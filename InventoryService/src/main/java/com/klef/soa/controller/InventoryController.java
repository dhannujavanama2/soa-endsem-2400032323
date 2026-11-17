package com.klef.soa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/")
    public ResponseEntity<String> getInventory() {
        return ResponseEntity.ok("Inventory Service is Running");
    }
}