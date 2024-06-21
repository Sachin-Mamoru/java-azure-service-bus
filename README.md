# Java Azure Service Bus Example

This project demonstrates how to send and receive messages using Azure Service Bus in a Java application. It includes examples for creating topics and subscriptions programmatically, sending messages to a topic, and receiving messages from a subscription.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven
- An active Azure subscription
- An Azure Service Bus namespace with appropriate connection string

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/Sachin-Mamoru/java-azure-service-bus.git
cd java-azure-service-bus
```

## Configuration
Replace `YOUR_SERVICE_BUS_CONNECTION_STRING`, `YOUR_TOPIC_NAME`, and `YOUR_SUBSCRIPTION_NAME` with your actual values in the source code.

**Dependencies**
Ensure the following dependencies are included in your pom.xml:

```xml
<dependency>
    <groupId>com.microsoft.azure</groupId>
    <artifactId>azure-servicebus</artifactId>
    <version>5.1.0</version>
</dependency>
```

## Project Structure

.
├── pom.xml
├── src
│   └── main
│       └── java
│           └── com
│               └── example
│                   ├── CreateTopicAndSubscription.java
│                   ├── SendMessage.java
│                   └── ReceiveMessage.java
└── README.md

### Contributing

If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.
