package com.romeo.users.service;

import com.romeo.users.model.User;
import reactor.core.publisher.Flux;

public interface UserService {
    Flux<User> findAllUsers();
}
