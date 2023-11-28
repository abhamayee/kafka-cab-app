package com.example.cabbookuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void findCabLocation(String location) {
        System.out.println("location = " + location);
    }
}
