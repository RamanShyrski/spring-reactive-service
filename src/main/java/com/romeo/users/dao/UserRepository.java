package com.romeo.users.dao;

import com.romeo.users.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

public interface UserRepository extends ReactiveCrudRepository<User,String> {

}
