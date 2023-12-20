package com.example.dem2.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {



    User findByName(String userName);
}
