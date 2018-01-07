package com.codepuran.service;

import com.codepuran.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}