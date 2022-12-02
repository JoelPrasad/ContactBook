package com.joelprasad.contactbook.service;

import com.joelprasad.contactbook.model.userModel;
import com.joelprasad.contactbook.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class userService {
    @Autowired
    private userRepository UserRepository;
    public List<userModel> listAllUser(){
        return UserRepository.findAll();
    }

    public void saveUser(userModel User) {
        UserRepository.save(User);
    }

    public userModel getUser(Integer id) {
        return UserRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        UserRepository.deleteById(id);
    }
}