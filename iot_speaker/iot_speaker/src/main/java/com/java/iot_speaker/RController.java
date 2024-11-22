package com.java.iot_speaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

@RestController
public class RController {

    @Autowired
    private MqttUtil mqttUtil;

    @RequestMapping("/audio/number/{id}")
    public void playAudio(@PathVariable(value = "id") String id){
        String topic = "topic/audio/number";
        String message = id;
        mqttUtil.publisher(topic, message);
    }

    @RequestMapping("/audio/action/{action}")
    public void listenAction(@PathVariable(value = "action") String action){
        String topic = "topic/audio/action";
        String message = action;
        mqttUtil.publisher(topic, message);
    }
}
