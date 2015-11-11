package cz.vutbr.feec.farkas.repository;


import cz.vutbr.feec.farkas.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String> {

    User findByUserName(String userName);

    User findByUserNameAndPassword(String userName, String password);

}

