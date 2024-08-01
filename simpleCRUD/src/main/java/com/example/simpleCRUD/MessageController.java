package com.example.simpleCRUD;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MessageController {

    @GetMapping("/")
    public String messageForm(Model model){
        model.addAttribute("message", new Message());
        return "message";
    }

    @PostMapping("/")
    public String messageSubmit(@ModelAttribute Message message, Model model){
        model.addAttribute("message", message);
        return "result";
    }
}
