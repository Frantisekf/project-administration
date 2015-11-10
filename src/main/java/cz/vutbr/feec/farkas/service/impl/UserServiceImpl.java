package cz.vutbr.feec.farkas.service.impl;

import cz.vutbr.feec.farkas.model.User;
import cz.vutbr.feec.farkas.repository.UserRepository;
import cz.vutbr.feec.farkas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by frantisek on 8.11.15.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    //git test
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    public boolean findByLogin(String userName, String password) {
        User user = userRepository.findByUserName(userName);

        if (user != null && user.getPassword().equals(password)) {
            return true;
        }

        return false;
    }

    public boolean findByUserName(String userName) {
        User user = userRepository.findByUserName(userName);

        if (user != null) {
            return true;
        }

        return false;
    }
}

