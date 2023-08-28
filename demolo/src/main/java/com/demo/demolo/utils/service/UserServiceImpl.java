package com.demo.demolo.utils.service;

import com.demo.demolo.entity.User;
import com.demo.demolo.utils.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Repository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
