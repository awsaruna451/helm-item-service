package com.aruna.service;

import com.aruna.dto.ItemResponseDTO;
import com.aruna.dto.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    public ItemResponseDTO updateItems(OrderDTO orderDTO);
}
