package org.example.services;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class WaterHeaterService {

    @Autowired
    RestTemplate restTemplate;

    @PostConstruct
    public void setup(){
        log.info("running");
    }

//    @Scheduled(cron = "0 0 6 ? * * ")
    @Scheduled(cron = "* * * * * *")
    public void runWaterHeater() {

        log.info("running water heater");
        String s = restTemplate.getForObject("http://192.168.1.2/5/on", String.class);
        log.info(s);
    }
}
