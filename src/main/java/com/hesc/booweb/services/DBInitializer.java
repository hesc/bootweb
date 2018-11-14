package com.hesc.booweb.services;

import com.hesc.booweb.entities.LastCustomer;
import com.hesc.booweb.entities.Status;
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
    LastCustomerService singerService;

    @Autowired
    ToReadService toReadService;

    @PostConstruct
    public void initDB() {
        logger.info("Starting database initialization...");
        LastCustomer lastCustomer = new LastCustomer();
        lastCustomer.setFirstName("John");
        lastCustomer.setLastName("Mayer");
        lastCustomer.setAgentKey("tzhxy1");
        lastCustomer.setCustomerPhoneNumber("+ 41 58 100 20 30");
        lastCustomer.setLastSearch(new Date());
        singerService.save(lastCustomer);

        lastCustomer = new LastCustomer();
        lastCustomer.setFirstName("Max");
        lastCustomer.setLastName("Muster");
        lastCustomer.setAgentKey("tzhxy1");
        lastCustomer.setCustomerPhoneNumber("+ 41 58 222 20 55");
        lastCustomer.setLastSearch(new Date());
        singerService.save(lastCustomer);


        lastCustomer = new LastCustomer();
        lastCustomer.setFirstName("Karl");
        lastCustomer.setLastName("Klammer");
        lastCustomer.setAgentKey("tzhxy2");
        lastCustomer.setCustomerPhoneNumber("+ 41 58 213 20 55");
        lastCustomer.setLastSearch(new Date());
        singerService.save(lastCustomer);

        lastCustomer = new LastCustomer();
        lastCustomer.setFirstName("Karl");
        lastCustomer.setLastName("Kummer");
        lastCustomer.setAgentKey("tzhxy3");
        lastCustomer.setCustomerPhoneNumber("+ 41 79 100 20 55");
        lastCustomer.setLastSearch(new Date());
        singerService.save(lastCustomer);


        ToReadItem item = new ToReadItem();
        item.setName("SAFe lean agile leaders");
        item.setUrl("https://www.scaledagileframework.com/lean-agile-leaders");
        item.setPriority(8);
        item.setStatus(Status.created);
        item.setCategory("Lean Agile");
        toReadService.save(item);

        item = new ToReadItem();
        item.setName("Bluewin");
        item.setUrl("https://bluewin.ch");
        item.setPriority(8);
        item.setCategory("News");
        item.setStatus(Status.created);
        toReadService.save(item);


        logger.info("Database initialization finished.");
    }
}
