package com.hesc.booweb.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hesc.booweb.entities.ToReadItem;
import com.hesc.booweb.services.ToReadService;


@RestController
public class ToReadRestService {

	@Autowired
	private ToReadService toReadService;


	@GetMapping("/api/items")
	public List<ToReadItem> getItems() {
		return toReadService.findAll();
	}





}
