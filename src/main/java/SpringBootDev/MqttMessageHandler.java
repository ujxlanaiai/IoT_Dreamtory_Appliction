package SpringBootDev;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

public class MqttMessageHandler implements MessageHandler {

    @Override
    public void handleMessage(Message<?> message) throws MessagingException {
        // Handle incoming MQTT message (e.g., extract JSON payload)
        String payload = message.getPayload().toString();
        System.out.println("Received MQTT message: " + payload);
    }
}
