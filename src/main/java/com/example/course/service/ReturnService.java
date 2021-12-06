package com.example.course.service;

import com.example.course.repo.ReturnRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReturnService {
    private final ReturnRepo returnRepo;

    public void create() {

    }
}
