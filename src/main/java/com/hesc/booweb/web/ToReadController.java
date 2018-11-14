package com.hesc.booweb.web;

import com.hesc.booweb.entities.ToReadItem;
import com.hesc.booweb.services.ToReadService;
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
@RequestMapping(value = "/toread")
public class ToReadController {

    private final Logger logger = LoggerFactory.getLogger(ToReadController.class);

    @Autowired
    private ToReadService toReadService;


    @GetMapping
    public String list(Model uiModel) {
        logger.info("Listing items");
        List<ToReadItem> items = toReadService.findAll();
        uiModel.addAttribute("items", items);
        return "toread";
    }


    @GetMapping(value = "/edit/{id}")
    public String updateForm(@PathVariable String id, Model model) {
        model.addAttribute("item", toReadService.findById(id));
        return "update";
    }

    @GetMapping(value = "/new")
    public String createForm(Model uiModel) {
        ToReadItem toReadItem = new ToReadItem();
        uiModel.addAttribute("item", toReadItem);
        return "update";
    }


    @PostMapping
    public String saveItem(@Valid ToReadItem toReadItem) {
        toReadService.save(toReadItem);
        return "redirect:/toread/";
    }


}
