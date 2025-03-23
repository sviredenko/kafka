package ru.sviredenkoa.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sviredenkoa.KafkaProducer;

@Service
@AllArgsConstructor
public class SendMessageService {
    private final KafkaProducer kafkaProducer;

    //sendMessage()
}
