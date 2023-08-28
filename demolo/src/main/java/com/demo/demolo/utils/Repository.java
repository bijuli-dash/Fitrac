package com.demo.demolo.utils;

import com.demo.demolo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface Repository extends JpaRepository<User,Integer> {

}
