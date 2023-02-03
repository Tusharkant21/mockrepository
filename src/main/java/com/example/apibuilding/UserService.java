package com.example.apibuilding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUserById(int id){
     User user= userRepository.findById(id).get();
     return user;
    }

//    public User getUserByName(String name){
//        User user = userRepository.findByName(name);
//        return user;
//    }
}
