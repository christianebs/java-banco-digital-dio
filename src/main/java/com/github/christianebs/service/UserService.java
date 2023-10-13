package com.github.christianebs.service;

import com.github.christianebs.model.User;

public interface UserService {
    User findById(long id);

    User create(User userToCreate);
}
