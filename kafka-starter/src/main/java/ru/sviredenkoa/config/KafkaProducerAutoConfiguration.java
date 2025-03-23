package ru.sviredenkoa.config;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@EnableConfigurationProperties(KafkaProducerProperties.class)
public class KafkaProducerAutoConfiguration {

    @Bean
    @ConditionalOnProperty(value = "kafka.producer.enable", havingValue = "true", matchIfMissing = false)
    KafkaProducer producer(KafkaProducerProperties kafkaProducerProperties) {
        Properties properties = convertKafkaProperties(kafkaProducerProperties);
        return new KafkaProducer<>(properties);
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
        //properties.setProperty("schema.registry.url", kafkaProducerProperties.getRegistry());
        return properties;
    }
}
