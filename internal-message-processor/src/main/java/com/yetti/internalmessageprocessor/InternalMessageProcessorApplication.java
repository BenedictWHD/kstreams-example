package com.yetti.internalmessageprocessor;

import com.yetti.common.internalmessage.InternalMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
@Slf4j
public class InternalMessageProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternalMessageProcessorApplication.class, args);
	}

	@Bean
	public Consumer<KStream<String, InternalMessage>> internalMessageConsumer() {
		return kstream -> kstream.foreach((k,v)->log.info(v.toString()));
	}

}
