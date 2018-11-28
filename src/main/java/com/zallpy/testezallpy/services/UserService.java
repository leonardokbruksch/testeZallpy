package com.zallpy.testezallpy.services;

import com.zallpy.testezallpy.entities.User;
import com.zallpy.testezallpy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createRandomUsers(){
        User user = new User();

        user.setId((long) 1);
        user.setEnabled(true);
        user.setEmail("leokb@gmail.com");
        user.setName("Leonardo");
        user.setSurname("Bruksch");
        user.setPassword("123");
        user.setPhone("99887766");
        user.setRegisterDate(new Date());

        userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

}
