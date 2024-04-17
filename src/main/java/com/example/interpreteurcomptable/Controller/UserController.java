package com.example.interpreteurcomptable.Controller;

import com.example.interpreteurcomptable.Entities.User;
import com.example.interpreteurcomptable.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userClientService;

    @GetMapping
    public ResponseEntity<List<User>> getUserClient() {
        return new ResponseEntity<List<User>>(userClientService.getUser(), HttpStatus.OK);
    }
}
