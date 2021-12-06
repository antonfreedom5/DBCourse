package com.example.course.controller;

import com.example.course.service.ReturnService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/return")
@RequiredArgsConstructor
public class ReturnController {
    private final ReturnService returnService;
}
