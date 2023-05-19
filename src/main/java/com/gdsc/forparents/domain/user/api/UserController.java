package com.gdsc.forparents.domain.user.api;

import com.gdsc.forparents.domain.user.application.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    /**
     * 앱 첫 구동 시 userCode(UUID) 반환
     */
    @GetMapping("/user")
    public ResponseEntity<String> crateUser(){

        String userCode = userService.createUser();

        return new ResponseEntity<>(userCode, HttpStatus.OK);

    }
}
