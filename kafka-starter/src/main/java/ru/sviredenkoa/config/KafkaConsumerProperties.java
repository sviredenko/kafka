package ru.sviredenkoa.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kafka.consumer")
@Getter
@Setter
public class KafkaConsumerProperties {
    private Boolean enable;
    private String server;
    private String port;
    private String topic;
    private String user;
    private String password;
    private String registryUrl;
}
