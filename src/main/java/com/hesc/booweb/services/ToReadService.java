package com.hesc.booweb.services;

import com.hesc.booweb.entities.ToReadItem;

import java.util.List;
import java.util.Optional;

public interface ToReadService {
    List<ToReadItem> findAll();

    public Optional<ToReadItem> findById(String id);

    ToReadItem save(ToReadItem toReadItem);
}
