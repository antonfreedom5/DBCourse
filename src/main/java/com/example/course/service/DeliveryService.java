package com.example.course.service;

import com.example.course.repo.DeliveryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryService {
    private final DeliveryRepo deliveryRepo;

    public void create() {

    }
}
