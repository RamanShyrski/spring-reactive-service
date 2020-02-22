package com.romeo.users.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@RequiredArgsConstructor
public class User {
  @Id
  private String username;
  private String password;
}
