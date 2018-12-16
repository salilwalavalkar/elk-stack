package com.salil.elk.sample;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
class ELKController {
    private static final Logger LOG = Logger.getLogger(ELKController.class.getName());

    @RequestMapping(value = "/elk-info")
    public String info() {
        String response = "Hello World ! " + new Date();
        LOG.log(Level.INFO, "Called /elk-info:" + response);
        return response;
    }
}