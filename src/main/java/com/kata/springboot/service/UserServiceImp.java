package com.kata.springboot.service;

import com.kata.springboot.model.User;
import com.kata.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public User findById(Long id){
        return userRepository.getOne(id);
    }

    @Override
    @Transactional
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User saveUser(User user){
        return userRepository.save(user);
    }
    @Override
    @Transactional
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}