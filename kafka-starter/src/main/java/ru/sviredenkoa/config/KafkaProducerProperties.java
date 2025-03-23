package ru.sviredenkoa.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kafka.producer")
@Getter
@Setter
public class KafkaProducerProperties {
    private Boolean enable;
    private String server;
    private String port;
    private String topic;
    private String user;
    private String password;
    private String registry;
}
