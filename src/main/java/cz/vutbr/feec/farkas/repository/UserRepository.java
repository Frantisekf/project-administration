package cz.vutbr.feec.farkas.repository;

;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import cz.vutbr.feec.farkas.model.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    //git test
    @Query("select s from User s where s.userName = :userName")
    User findByUserName(@Param("userName") String userName);

}

