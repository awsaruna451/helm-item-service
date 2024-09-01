package com.aruna.controller;

import com.aruna.dto.ApiResponse;
import com.aruna.dto.ItemResponseDTO;
import com.aruna.dto.OrderDTO;
import com.aruna.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/")
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/items")
    public ResponseEntity<ItemResponseDTO> placeOrder(@RequestBody OrderDTO orderDTO) {
        // Logic for GET request
      //  ApiResponse response =  ApiResponse.builder().data(itemService.updateItems(orderDTO)).build();
        return ResponseEntity.ok(itemService.updateItems(orderDTO));
    }

}
