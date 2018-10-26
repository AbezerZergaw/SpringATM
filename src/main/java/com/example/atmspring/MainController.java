package com.example.atmspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/")
    public String homePage(Model model) {


        return "index";
    }

    public String deposit(Model model) {
        return "deposit";
    }

    public String withdrawal(Model model) {

        return "withdrawal";
    }

    public String transaction(Model model) {
        return "transaction";
    }
}
