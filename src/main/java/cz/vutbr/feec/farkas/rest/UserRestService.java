package cz.vutbr.feec.farkas.rest;

import cz.vutbr.feec.farkas.exceptions.GeneralException;
import cz.vutbr.feec.farkas.model.LoginResponse;
import cz.vutbr.feec.farkas.model.User;
import cz.vutbr.feec.farkas.model.UserLogin;
import cz.vutbr.feec.farkas.service.UserService;
import cz.vutbr.feec.farkas.shared.Error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

/**
 * Created by frant on 11/11/15.
 */

@RequestMapping("/api/user")
@RestController
public class UserRestService {


    @Inject
    UserService userService;


    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void signup(@RequestBody User user) {

        if (userService.findByUserName(user.getUserName()) != null) {
            throw new GeneralException(Error.DUPLICATE_USER.getCode(), Error.DUPLICATE_USER.getDescription());
        } else {
            userService.create(user);
        }


    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponse login(@RequestBody UserLogin userLogin) {

        User found = userService.findByUserNameAndPassword(userLogin.getUserName(), userLogin.getPassword());

        if (found != null) {
            return new LoginResponse(true);
        } else {
            return new LoginResponse(false);
        }
    }
}
