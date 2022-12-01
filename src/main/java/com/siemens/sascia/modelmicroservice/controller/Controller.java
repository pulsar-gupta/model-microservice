package com.siemens.sascia.modelmicroservice.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    String gg(){
        log.info("-- info called ---- ");
        return "info";
    }
}
