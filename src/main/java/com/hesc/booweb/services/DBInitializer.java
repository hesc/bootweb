package com.hesc.booweb.services;

import com.hesc.booweb.entities.LastCustomer;
import com.hesc.booweb.entities.ToReadItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;


@Service
public class DBInitializer {

    private Logger logger = LoggerFactory.getLogger(DBInitializer.class);


    @Autowired
    ToReadService toReadService;

    @PostConstruct
    public void initDB() {
        logger.info("Starting database initialization...");


        ToReadItem item = new ToReadItem();
        item.setId("1234");
        item.setName("fancy read");
        toReadService.save(item);


        logger.info("Database initialization finished.");
    }
}
