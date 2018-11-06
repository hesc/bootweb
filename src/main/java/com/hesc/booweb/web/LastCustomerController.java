package com.hesc.booweb.web;

import com.hesc.booweb.entities.LastCustomer;
import com.hesc.booweb.services.LastCustomerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping(value = "/lastcustomer")
public class LastCustomerController {

    private final Logger logger = LoggerFactory.getLogger(LastCustomerController.class);

    @Autowired
    private LastCustomerService lastCustomerService;

    @GetMapping
    public String list(Model uiModel) {
        logger.info("Listing lastcustomer");
        List<LastCustomer> lastCustomers = lastCustomerService.findAll();
        uiModel.addAttribute("lastcustomers", lastCustomers);
        logger.info("No. of singers: " + lastCustomers.size());
        return "lastcustomers";
    }

    @GetMapping(value = "/{agentKey}")
    public String show(@PathVariable("agentKey") String agentKey, Model uiModel) {
        List<LastCustomer> lastCustomers = lastCustomerService.findByagentKey(agentKey);
        uiModel.addAttribute("lastcustomers", lastCustomers);
        return "lastcustomers";
    }

//
//    @GetMapping(value = "/edit/{id}")
//    public String updateForm(@PathVariable Long id, Model model) {
//        model.addAttribute("singer", lastCustomerService.findById(id));
//        return "update";
//    }

    @GetMapping(value = "/new")
    public String createForm(Model uiModel) {
        LastCustomer lastcustomer = new LastCustomer();
        uiModel.addAttribute("lastcustomer", lastcustomer);
        return "update";
    }


    @PostMapping
    public String saveSinger(@Valid LastCustomer lastcustomer) {
        lastCustomerService.save(lastcustomer);
        return "redirect:/lastcustomer/";
    }

}
