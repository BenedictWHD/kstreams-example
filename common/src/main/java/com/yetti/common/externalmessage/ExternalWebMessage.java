package com.yetti.common.externalmessage;

public class ExternalVoiceMessage extends ExternalMessage {
    public ExternalVoiceMessage(String messageType, String numberFrom, String numberTo, String ccy, String quantity) {
        super("", ExternalMessageSource.VOICE, messageType, numberFrom, numberTo, ccy, quantity);
    }
}
