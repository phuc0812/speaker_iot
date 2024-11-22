package com.java.iot_speaker;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.stereotype.Component;

@Component
public class MqttUtil {

    public void subscriber(){
        String broker = "tcp://broker.hivemq.com:1883";
        String topic = "topic/weather";
        try{
            MqttClient client = new MqttClient(broker, MqttClient.generateClientId());
            client.setCallback(new MqttCallback() {
                @Override
                public void connectionLost(Throwable throwable) {
                    System.out.println("Connection to Mqtt broker lost");
                }

                @Override
                public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
                    String message = new String(mqttMessage.getPayload());
                    System.out.println(message);
                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

                }
            });
            client.connect();
            client.subscribe(topic, 0);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void publisher(String topic, String ms){
        try{
            MqttClient client = new MqttClient("tcp://broker.hivemq.com:1883", MqttClient.generateClientId());
            client.connect();
            MqttMessage message = new MqttMessage();
            message.setPayload(ms.getBytes());
            message.setQos(0);
            client.publish(topic, message);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
