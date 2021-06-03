package com.yetti.externalmessageprocessor.externalmessagereceiver;


import com.yetti.common.externalmessage.ExternalMessage;
import com.yetti.common.externalmessage.ExternalMessageSource;
import org.springframework.stereotype.Component;

@SuppressWarnings("unchecked")
@Component
public class MessageReceiverFactory {

    private final MessageReceiver smsMessageReceiver = new SMSMessageReceiver();
    private final MessageReceiver voiceMessageReceiver = new VoiceMessageReceiver();

    public MessageReceiver<ExternalMessage> getMessageReceiver(ExternalMessageSource messageType) {

        return switch (messageType) {
            case SMS -> smsMessageReceiver;
            case VOICE -> voiceMessageReceiver;
        };

    }

}
