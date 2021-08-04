package com.spring.springpetclinic.controllers;

import com.spring.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController
{
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/index")
    public String getVet(Model model)
    {
        model.addAttribute("owners",ownerService.findAll());

        return "/owner/index";
    }
}
