package com.example.course.service;

import com.example.course.repo.StorageRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StorageService {
    private final StorageRepo storageRepo;
}
