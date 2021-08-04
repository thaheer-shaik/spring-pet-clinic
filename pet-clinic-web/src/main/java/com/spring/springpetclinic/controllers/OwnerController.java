package com.spring.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class OwnerController
{
    @RequestMapping("/owner")
    public String getVet()
    {        return "/owner/index";
    }
}
