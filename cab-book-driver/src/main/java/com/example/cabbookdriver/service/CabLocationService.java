package com.example.cabbookdriver.service;

import com.example.cabbookdriver.constant.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppUtil.CAB_LOCATION,location);
        return true;
    }

}
