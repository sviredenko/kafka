package ru.sviredenkoa.service;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import lombok.AllArgsConstructor;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

@AllArgsConstructor
public class ProducerService<T extends KafkaAvroSerializer,P extends KafkaAvroSerializer> {
    private final KafkaProducer<T, P> kafkaProducer;
    private final String topic;

    void sendMessage(T keyRecord, P valueRecord) {
        var record = new ProducerRecord(topic, keyRecord, valueRecord);
        kafkaProducer.send(record, new Callback() {
            @Override
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
            }
        });
        kafkaProducer.flush();
        kafkaProducer.close();
    }

}
