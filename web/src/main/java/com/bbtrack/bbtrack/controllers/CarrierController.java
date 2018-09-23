package com.bbtrack.bbtrack.controllers;


import com.bbtrack.bbtrack.services.CarrierService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/carriers"})
public class CarrierController {
    private CarrierService carrierService;

    public CarrierController(CarrierService carrierService) {
        this.carrierService = carrierService;
    }

    @RequestMapping({"","/","/carriersList","/carriersList.html","index"})
    public String listCarriers(Model model){
        model.addAttribute("carriers", carrierService.findAll());
        return "carriers/carriersList";
    }
}
