package com.hesc.booweb.services;

import java.util.List;

import com.hesc.booweb.entities.LastCustomer;
import com.hesc.booweb.entities.ToReadItem;

public interface ToReadService {
    List<ToReadItem> findAll();
    ToReadItem save(ToReadItem toReadItem);
}
