package com.example.service;

import com.example.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUser(int age);
}
