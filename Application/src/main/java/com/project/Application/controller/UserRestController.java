package com.project.Application.controller;


import com.project.Application.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController // restcontroller instead of controller beacuse it returns an http json
@RequestMapping("api/users")
public class UserRestController {

    private final UserRepository userRepository;

    // GET /api/users : List All Users

}
