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
        user.setUsername("leokb");
        user.setEnabled(true);
        user.setEmail("leokb@gmail.com");
        user.setName("Leonardo");
        user.setSurname("Bruksch");
        user.setPassword("123");
        user.setPhone("99887766");
        user.setRegisterDate(new Date());

        userRepository.save(user);

        user = new User();

        user.setId((long) 2);
        user.setUsername("joao12");
        user.setEnabled(true);
        user.setEmail("leokb@gmail.com");
        user.setName("Joao");
        user.setSurname("Bruksch");
        user.setPassword("123");
        user.setPhone("99887766");
        user.setRegisterDate(new Date());

        userRepository.save(user);

        user = new User();

        user.setId((long) 3);
        user.setUsername("mario43");
        user.setEnabled(true);
        user.setEmail("leokb@gmail.com");
        user.setName("Mario");
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
