package com.ntb.hackertonntb.service;

import com.ntb.hackertonntb.domain.entity.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
