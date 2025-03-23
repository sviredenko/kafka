package ru.sviredenkoa.config;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

public class KafkaConsumerAutoConfiguration {
    @Bean
    @ConditionalOnProperty(value = "kafka.consumer.enable", havingValue = "true", matchIfMissing = true)
    KafkaConsumer<String, String> consumer(KafkaProducerProperties kafkaProducerProperties) {
        Properties properties = convertKafkaProperties(kafkaProducerProperties);
        return new KafkaConsumer<>(properties);
    }

    static private Properties convertKafkaProperties(KafkaProducerProperties kafkaProducerProperties) {
        Properties properties =  new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProducerProperties.getServer());
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        properties.put(SaslConfigs.SASL_MECHANISM, "SCRAM-SHA-512");
        properties.put(SaslConfigs.SASL_JAAS_CONFIG,
                "org.apache.kafka.common.security.scram.ScramLoginModule required username=\"" +
                        kafkaProducerProperties.getUser()
                        + "\" password=\"" + kafkaProducerProperties.getPassword() + "\";");
        return properties;
    }
}
