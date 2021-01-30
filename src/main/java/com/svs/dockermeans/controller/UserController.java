package com.svs.dockermeans.controller;

import com.svs.dockermeans.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

  @GetMapping(path = "/details")
  public ResponseEntity<User> getUser(){
    User user = new User(1,"Shailesh","Sydney");
    return ResponseEntity.status(HttpStatus.OK)
        .body(user);
  }
}
