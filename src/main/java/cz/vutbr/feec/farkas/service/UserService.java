package cz.vutbr.feec.farkas.service;

import cz.vutbr.feec.farkas.model.User;

import java.util.List;

/**
 * Created by frantisek on 8.11.15.
 */
public interface UserService {

    User create(User user);

    void delete(String id);

    List<User> findAll();

    User findById(String id);

    User update(User user);

    User findByUserNameAndPassword(String userName, String password);

    User findByUserName(String userName);
}

