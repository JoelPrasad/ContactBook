package com.joelprasad.contactbook.controller;

import com.joelprasad.contactbook.model.userModel;
import com.joelprasad.contactbook.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class userController {
    @Autowired
    userService UserService;

    @GetMapping("")
    public List<userModel> list(){
        return UserService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<userModel> get(@PathVariable Integer id) {
        try {
            userModel User = UserService.getUser(id);
            return new ResponseEntity<userModel>(User, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<userModel>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value ="/")
    public void add(@RequestBody userModel User) {
        UserService.saveUser(User);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody userModel User, @PathVariable Integer id) {
        try {
            userModel existUser = UserService.getUser(id);
            User.setId(id);
            UserService.saveUser(User);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        UserService.deleteUser(id);
    }
}