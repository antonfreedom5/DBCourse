package com.example.course.service;

import com.example.course.repo.DiscountRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscountService {
    private final DiscountRepo discountRepo;
}
