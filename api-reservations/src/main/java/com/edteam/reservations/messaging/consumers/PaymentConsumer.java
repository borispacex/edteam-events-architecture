package com.edteam.reservations.messaging.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentConsumer.class);

    @KafkaListener(topics = "payments", groupId = "api-reservation")
    public void listen(String message) {
        LOGGER.info("Mensaje recibido : {}", message);
    }

}
