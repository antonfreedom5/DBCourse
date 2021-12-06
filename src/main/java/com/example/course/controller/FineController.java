package com.example.course.controller;

import com.example.course.service.FineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fine")
@RequiredArgsConstructor
public class FineController {
    private final FineService fineService;
}
