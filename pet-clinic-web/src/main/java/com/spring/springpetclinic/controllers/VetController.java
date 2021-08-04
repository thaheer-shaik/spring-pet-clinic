package com.spring.springpetclinic.controllers;

import com.spring.springpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController
{

    private final VetService vetService;

    public VetController(VetService vetService)
    {
        this.vetService = vetService;
    }

    @RequestMapping("/index")
    public String getVet(Model model)
    {
        model.addAttribute("vets",vetService.findAll());
        return "/vet/index";
    }
}
