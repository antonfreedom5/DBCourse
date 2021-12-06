package com.example.course.service;

import com.example.course.repo.PositionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PositionService {
    private final PositionRepo positionRepo;
}
