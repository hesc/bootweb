package com.hesc.booweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class BootWebApplication {

    private static Logger logger = LoggerFactory.getLogger(BootWebApplication.class);

    public static void main(String... args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(BootWebApplication.class, args);
        assert (ctx != null);
        logger.info("Application started...");

    }
}
