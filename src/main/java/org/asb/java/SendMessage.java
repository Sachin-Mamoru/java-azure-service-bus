package org.asb.java;

import com.azure.messaging.servicebus.*;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

import java.util.concurrent.TimeUnit;

public class SendMessage {
    private static final String CONNECTION_STRING = "YOUR_SERVICE_BUS_CONNECTION_STRING";
    private static final String TOPIC_NAME = "YOUR_TOPIC_NAME";

    public static void main(String[] args) {
        // Create a Service Bus Sender client
        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
                .connectionString(CONNECTION_STRING)
                .sender()
                .topicName(TOPIC_NAME)
                .buildClient();

        // Send a message to the topic
        String message = "Hello, Azure Service Bus!";
        senderClient.sendMessage(new ServiceBusMessage(message));

        System.out.println("Message sent: " + message);

        // Close the client
        senderClient.close();
    }
}

