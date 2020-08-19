package com.example.springboot.dal;

import com.example.springboot.model.User;
import java.util.List;

public interface UserDAL {
 List<User> findAll();

 User findById(String userId);

 User save(User user);

 void deleteById(String userId);
}