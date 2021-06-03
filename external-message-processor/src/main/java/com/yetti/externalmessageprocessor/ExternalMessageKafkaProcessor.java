package com.yetti.externalmessageprocessor;

import com.yetti.common.externalmessage.ExternalMessage;
import com.yetti.common.internalmessage.InternalMessage;
import com.yetti.externalmessageprocessor.externalmessagereceiver.MessageReceiverFactory;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ExternalMessageKafkaProcessor {

    @Autowired
    MessageReceiverFactory messageReceiverFactory;

    @Bean
    public Function<KStream<String, ExternalMessage>, KStream<String, InternalMessage>> externalMessageProcessor() {

        return externalMessageStream -> externalMessageStream.map((k, v) -> new KeyValue<>(k, messageReceiverFactory.getMessageReceiver(v.getExternalMessageSource()).processExternalMessage(v)));

    }

}
