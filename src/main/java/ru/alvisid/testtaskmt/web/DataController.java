package ru.alvisid.testtaskmt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.alvisid.testtaskmt.model.User;
import ru.alvisid.testtaskmt.service.UserService;

@Controller
public class DataController {
    private UserService service;

    @Autowired
    public DataController(UserService service) {
        this.service = service;
    }


    @RequestMapping("user/{id}")
    public @ResponseBody
    User user(@PathVariable int id) {
        return service.get(id);
    }
}
