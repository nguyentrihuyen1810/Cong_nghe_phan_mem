package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("camping/listAttachService")
public class AttachServiceController {
    @GetMapping("")
    public String home() {
        return "camping/user/listAttachService";
    }
}
