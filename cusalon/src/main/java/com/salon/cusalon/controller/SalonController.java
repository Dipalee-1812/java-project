package com.salon.cusalon.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salon.cusalon.entity.Salon;
import com.salon.cusalon.services.SalonService;

@Controller
public class SalonController {
    
    @Autowired  
    private SalonService salonService;

    @RequestMapping("/")
    public String homepage(Model model)
    {
        model.addAttribute("today" , LocalDate.now());
        return "home";
    }
  
    @RequestMapping("/view")
    public String getAllSalon(Model model)
    {
        model.addAttribute("tasks", this.salonService.getAll());
        return "ViewUser.html";
    }
    @RequestMapping("/add")
    public String addSalon(Model model)
    {
        model.addAttribute("salon",new Salon());
        return "addUser.html";
    }

    @RequestMapping("/login")
    public String loginpage(Model model)
    {
        return "login";
    }
    @RequestMapping("/login2")
    public String login(Model model)
    {
        return "login2";
    }
    @RequestMapping("/addSalon")
    public String addSalonDone(@ModelAttribute Salon salon)
    {
        this.salonService.addSalon(salon);
        return "redirect:/view";
    }

    @RequestMapping("/delete/{id}")
    public String deleteSalon(@PathVariable Integer id)
    {
        this.salonService.deleteSalon(id);
        return "redirect:/view";
    }
    @RequestMapping("/update/{id}")
    public String updateSalon(Model model,@PathVariable Integer id)
    { 
        model.addAttribute("salon", this.salonService.searchSalon(id));
        return "updateInfo.html";
    }
    @RequestMapping("/updatesalon")
    public String updateSalonDone(@ModelAttribute Salon salon)
    {
        this.salonService.updateSalon(salon);
        return "redirect:/view";
    }
}


