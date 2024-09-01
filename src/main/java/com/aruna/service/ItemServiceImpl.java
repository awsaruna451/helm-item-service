package com.aruna.service;

import com.aruna.dto.OrderDTO;
import com.aruna.dto.ItemResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@RequiredArgsConstructor
@Component
public class ItemServiceImpl implements ItemService {
    @Override
    public ItemResponseDTO updateItems(OrderDTO orderDTO) {

        return ItemResponseDTO.builder()
                .numberOfItems(5)
                .itmCode("S01")
                .totalPrice(new BigDecimal("350.00")).build();
    }

}


