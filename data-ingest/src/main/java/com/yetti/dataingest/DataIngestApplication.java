package com.yetti.dataingest;

import com.yetti.common.externalmessage.ExternalMessage;
import com.yetti.common.externalmessage.ExternalSMSMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.function.Supplier;

@SpringBootApplication
@Slf4j
public class DataIngestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataIngestApplication.class, args);
        log.info("Demo runner started successfully");
    }

    @Bean
    public Supplier<ExternalMessage> externalMessageProducer() {
        return () -> {
            ExternalMessage externalSMSMessage = new ExternalSMSMessage(UUID.randomUUID().toString(), "TRANSACTION", "1", "2", "NTTL", "2.5");
            log.info("Sending message: " + externalSMSMessage.getId());
            return externalSMSMessage;
        };
    }

}
