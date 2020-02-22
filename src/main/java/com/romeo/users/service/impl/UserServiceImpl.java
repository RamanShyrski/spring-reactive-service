package com.romeo.users.service.impl;

import com.romeo.users.dao.UserRepository;
import com.romeo.users.model.User;
import com.romeo.users.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Flux<User> findAllUsers() {
    return userRepository.findAll();
  }
}
