package cz.vutbr.feec.farkas.service;

import cz.vutbr.feec.farkas.model.User;

/**
 * Created by frantisek on 8.11.15.
 */
public interface UserService {
    //git test
    User save(User user);

    boolean findByLogin(String userName, String password);

    boolean findByUserName(String userName);
}

