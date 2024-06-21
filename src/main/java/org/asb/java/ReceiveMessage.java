package org.asb.java;

import com.azure.messaging.servicebus.*;

public class ReceiveMessage {
    private static final String CONNECTION_STRING = "YOUR_SERVICE_BUS_CONNECTION_STRING";
    private static final String SUBSCRIPTION_NAME = "YOUR_SUBSCRIPTION_NAME";
    private static final String TOPIC_NAME = "YOUR_TOPIC_NAME";

    public static void main(String[] args) {
        // Create a Service Bus Receiver client
        ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
                .connectionString(CONNECTION_STRING)
                .processor()
                .topicName(TOPIC_NAME)
                .subscriptionName(SUBSCRIPTION_NAME)
                .processMessage(ReceiveMessage::processMessage)
                .processError(context -> System.err.println("Error occurred: " + context.getException()))
                .buildProcessorClient();

        // Start the processor in the background
        processorClient.start();

        System.out.println("Press enter to stop the processor.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Stop the processor
        processorClient.close();
    }

    private static void processMessage(ServiceBusReceivedMessageContext context) {
        ServiceBusReceivedMessage message = context.getMessage();
        System.out.println("Received message: " + message.getBody().toString());
    }
}

