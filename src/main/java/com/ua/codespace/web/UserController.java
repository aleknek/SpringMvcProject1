package com.ua.codespace.web;

import com.ua.codespace.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping
    public String getUserList(Model model) {
        model.addAttribute("userList", Arrays.asList(new User("taras")));
        return "users";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser() {
        return "userForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveNewUser(User user) {
        System.out.println(user.getUsername());

        return "redirect:/users";
    }
}
