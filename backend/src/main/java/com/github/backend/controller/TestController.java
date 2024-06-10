package com.github.backend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
@Tag(name = "test API", description = "test")
public class TestController {

    @Operation(summary = "테스트", description = "테스트를 해본다.")
    @GetMapping("")
    public String findTest(){
        return "테스트 성공";
    }
}
