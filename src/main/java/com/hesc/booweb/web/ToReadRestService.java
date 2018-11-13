package com.hesc.booweb.web;


import com.hesc.booweb.entities.ToReadItem;
import com.hesc.booweb.services.ToReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


@RestController
public class ToReadRestService {

    @Autowired
    private ToReadService toReadService;


    @GetMapping("/api/items")
    public List<ToReadItem> getItems() {
        return toReadService.findAll();
    }


    @RequestMapping("/api/user")
    public Principal user(Principal principal) {
        return principal;
    }


}
