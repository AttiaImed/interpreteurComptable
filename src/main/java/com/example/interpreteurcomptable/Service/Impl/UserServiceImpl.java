package com.example.interpreteurcomptable.Service.Impl;


import com.example.interpreteurcomptable.Entities.User;
import com.example.interpreteurcomptable.Repository.UserRepository;
import com.example.interpreteurcomptable.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
