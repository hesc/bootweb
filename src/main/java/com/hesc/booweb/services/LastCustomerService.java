package com.hesc.booweb.services;

import com.hesc.booweb.entities.LastCustomer;

import java.util.List;

public interface LastCustomerService {
    List<LastCustomer> findAll();

    List<LastCustomer> findByagentKey(String agentKey);

    LastCustomer save(LastCustomer lastCustomer);
}
