package com.hesc.booweb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hesc.booweb.entities.LastCustomer;
import com.hesc.booweb.entities.ToReadItem;
import com.hesc.booweb.repos.LastCustomerRepository;
import com.hesc.booweb.repos.ToReadRepository;

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
    public ToReadItem save(ToReadItem toReadItem) {
        return toReadRepository.save(toReadItem);
    }




}
