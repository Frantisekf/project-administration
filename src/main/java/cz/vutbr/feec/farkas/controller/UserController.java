package cz.vutbr.feec.farkas.controller;

import cz.vutbr.feec.farkas.model.User;
import cz.vutbr.feec.farkas.model.UserLogin;
import cz.vutbr.feec.farkas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * Created by frantisek on 8.11.15.
 */

@Controller
@SessionAttributes("user")
public class UserController {
    //git test

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {

        User user = new User();
        model.addAttribute("user", user);

        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "signup";
        } else if (userService.findByUserName(user.getUserName())) {
            model.addAttribute("message", "User Name exists. Try another user name");
            return "signup";
        } else {
            userService.save(user);
            model.addAttribute("message", "Saved user details");
            return "redirect:login.jsp";
        }

    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("userLogin") UserLogin userLogin, BindingResult result) {
        if (result.hasErrors()) {
            return "login";
        } else {
            boolean found = userService.findByLogin(userLogin.getUserName(), userLogin.getPassword());
            if (found) {
                return "success";
            } else {
                return "failure";
            }
        }
    }
}

