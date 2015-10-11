package cz.vutbr.feec.farkas.core.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by frantisek farkas on 10-Oct-15.
 */
@Controller
public class MainController {

    private static final Logger logger = Logger.getLogger(MainController.class);

    String message = "Welcome ";

    @RequestMapping("/hello")
    public ModelAndView showMessage(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        System.out.println("in controller");

        ModelAndView mv = new ModelAndView("homepage");
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;

    }
}
