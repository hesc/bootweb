package com.hesc.booweb.services;

import com.hesc.booweb.entities.ToReadItem;
import com.hesc.booweb.repos.ToReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToReadServiceImpl implements ToReadService {


    @Autowired
    private ToReadRepository toReadRepository;

    public ToReadServiceImpl() {
    }

    @Override
    public List<ToReadItem> findAll() {
        List<ToReadItem> all = new ArrayList<>();
        toReadRepository.findAll().forEach(all::add);
        return all;
    }

    @Override
    public Optional<ToReadItem> findById(String id) {
        return toReadRepository.findById(id);
    }

    @Override
    public ToReadItem save(ToReadItem toReadItem) {
        return toReadRepository.save(toReadItem);
    }


}
