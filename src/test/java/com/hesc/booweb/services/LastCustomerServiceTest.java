package com.hesc.booweb.services;

import com.hesc.booweb.repos.LastCustomerRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LastCustomerServiceTest {


    @Autowired
    private LastCustomerService lastCustomerService;

    @Autowired
    private LastCustomerRepository lastCustomerRepository;


    @Test
    public void findAll() {

        lastCustomerRepository.findAll();

//        List<LastCustomer> lastCustomers = lastCustomerService.findAll();

    }


}
