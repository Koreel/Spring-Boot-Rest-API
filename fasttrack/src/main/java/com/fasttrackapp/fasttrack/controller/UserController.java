package com.fasttrackapp.fasttrack.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/users")
public class UserController {
    
     @GetMapping()
    public String getAllUsers
    (@RequestParam int page,
     @RequestParam int limit
    ) {
        
        return "Page " + page + " and limit " + limit + " was returned";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String userId) {
        
        return "User Information for user " + userId + " was returned";
    }

    @PostMapping
    public String createUser() {
        return "User Created";
    }

    @PutMapping
    public String updateUser() {
        return "User Updated";
    }

    @DeleteMapping 
    public String deleteUser() {
        return "User Deleted";
    }



}
