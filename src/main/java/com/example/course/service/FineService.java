package com.example.course.service;

import com.example.course.repo.FineRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FineService {
    private final FineRepo fineRepo;
}
