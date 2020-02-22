package com.romeo.users.controller;

import com.romeo.users.model.User;
import com.romeo.users.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping("/users")
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }


  @GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  private Flux<User> getAllEmployees() {
    return userService.findAllUsers();
  }
}
