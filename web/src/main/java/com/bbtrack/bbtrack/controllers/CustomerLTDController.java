package com.bbtrack.bbtrack.controllers;

import com.bbtrack.bbtrack.services.CustomerLDTService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/customerltd"})
public class CustomerLTDController {

    private CustomerLDTService customerLDTService;

    public CustomerLTDController(CustomerLDTService customerLDTService) {
        this.customerLDTService = customerLDTService;
    }

    @RequestMapping({"","/","/index","/customerLtdList","/customerLtdList.html"})
    public String listCustomerLtd(Model model){
        model.addAttribute("customerltd", customerLDTService.findAll());
        return "customerLtd/customerLtdList";
    }
}
