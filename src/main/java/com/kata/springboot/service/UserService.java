package com.kata.springboot.service;

import com.kata.springboot.model.User;

import java.util.List;

public interface UserService {
     User findById(Long id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
}
