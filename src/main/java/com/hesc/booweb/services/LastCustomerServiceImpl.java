package com.hesc.booweb.services;

import com.hesc.booweb.entities.LastCustomer;
import com.hesc.booweb.repos.LastCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LastCustomerServiceImpl implements LastCustomerService {


    @Autowired
    private LastCustomerRepository lastCustomerRepository;


    public LastCustomerServiceImpl() {
    }

    @Override
    public List<LastCustomer> findAll() {
        List<LastCustomer> all = new ArrayList<>();
        lastCustomerRepository.findAll().forEach(all::add);
        return all;
    }


    @Override
    public List<LastCustomer> findByagentKey(String agentKey) {
        return lastCustomerRepository.findByAgentKey(agentKey);
    }


    @Override
    public LastCustomer save(LastCustomer lastCustomer) {
        return lastCustomerRepository.save(lastCustomer);
    }


}
