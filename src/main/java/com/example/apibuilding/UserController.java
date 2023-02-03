package com.example.apibuilding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
 UserService userService;

@PostMapping("/add_user")
public void addUser(@RequestBody() User user){
    userService.addUser(user);
}
@GetMapping("/get_users")
   public List<User> getUsers(){
   return userService.getUsers();
}
@GetMapping("get_user")
public ResponseEntity getUserById(@RequestParam("id") int id){
    User user=userService.getUserById(id);
    //  return new ResponseEntity<>("Student details printed successfully ", HttpStatus.OK);
    return new ResponseEntity<>(user , HttpStatus.ACCEPTED);
}
//@GetMapping("get_userbyname")
//public User getUserByName(@RequestParam ("name") String name){
//    User user= userService.getUserByName(name);
//    return  user;
//}

}
