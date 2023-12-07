package com.example.demo.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class JPAService {
    private final static Logger LOGGER = LoggerFactory.getLogger(JPAService.class);

    public void save() {
        LOGGER.info("Save something...");
    }
}
