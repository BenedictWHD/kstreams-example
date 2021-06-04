package com.yetti.externalmessageprocessor.externalmessagereciever;


import com.yetti.common.externalmessage.ExternalMessage;
import com.yetti.common.externalmessage.ExternalMessageSource;
import org.springframework.stereotype.Component;

@SuppressWarnings("unchecked")
@Component
public class MessageReceiverFactory {

    private final MessageReceiver smsMessageReceiver = new SMSMessageReceiver();
    private final MessageReceiver webMessageReceiver = new WebMessageReceiver();

    public MessageReceiver<ExternalMessage> getMessageReceiver(ExternalMessageSource messageType) {

        switch (messageType) {
            case SMS:
                return smsMessageReceiver;
            case WEB:
                return webMessageReceiver;
        }

        return null;
    }

}
