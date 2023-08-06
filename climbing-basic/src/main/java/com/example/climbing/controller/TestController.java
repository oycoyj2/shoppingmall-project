package com.example.climbing.controller;

import com.example.climbing.controller.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public UserDto test() {

        UserDto userDto = new UserDto();
        userDto.setAge(20);
        userDto.setName("ye-chan");

        return userDto;
    }
}
