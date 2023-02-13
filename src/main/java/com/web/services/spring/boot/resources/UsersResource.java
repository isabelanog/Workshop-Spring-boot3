package com.web.services.spring.boot.resources;

import com.web.services.spring.boot.entities.Users;
import com.web.services.spring.boot.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersResource  {
    @Autowired
    private UsersService usersService;
    @GetMapping
    public ResponseEntity<List<Users>> findAll() {
        List<Users> usersList = usersService.findAll();
        return ResponseEntity.ok().body(usersList);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id) {
        Users user = usersService.findById(id);
        return ResponseEntity.ok().body(user);
    }

}