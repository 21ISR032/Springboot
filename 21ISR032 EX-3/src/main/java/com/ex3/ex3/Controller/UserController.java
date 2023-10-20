package com.ex3.ex3.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex3.ex3.Model.User;
import com.ex3.ex3.Service.Userserv;
@RestController
public class UserController {
@Autowired
User userRepo;
@Autowired
Userserv userServ;
@GetMapping("/all")
public List<User> getByCategory() {
return (ArrayList<User>) userRepo.findAll();
}
@PostMapping("/insert")
public String insertUser(@RequestBody User user) {
//userServ.addUser(user);
userRepo.save(user);
return "Data successfully inserted!";
}
@GetMapping("display/user{id}")
public Optional<org.apache.catalina.User> getById(@PathVariable long id) {
Optional<org.apache.catalina.User> user = userServ.getUserById(id);
return user;
}
@PutMapping("/update/user{id}")
public String updateUser(@PathVariable long id, @RequestBody User user) {
user.setId(id);
userServ.updateUser(id, user);
return "Updated Sucessfully.";
}
@DeleteMapping("/delete/user{id}")
public String deleteUser(@PathVariable long id) {
userServ.deleteUser(id);
return "Deleted Sucessfully.";
}}