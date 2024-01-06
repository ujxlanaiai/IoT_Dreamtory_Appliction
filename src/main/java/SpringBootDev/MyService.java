package SpringBootDev;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MessageChannel mqttInputChannel;

    public MyService(MessageChannel mqttInputChannel) {
        this.mqttInputChannel = mqttInputChannel;
    }

    // Method to send messages to MQTT (if needed)
    public void sendMessageToMqtt(String payload) {
        mqttInputChannel.send(MessageBuilder.withPayload(payload).build());
    }
}