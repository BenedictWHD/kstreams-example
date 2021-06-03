package com.yetti.common.externalmessage;

public class ExternalSMSMessage extends ExternalMessage {

    public ExternalSMSMessage(String id, String messageType, String numberFrom, String numberTo, String ccy, String quantity) {
        super(id, ExternalMessageSource.SMS, messageType, numberFrom, numberTo, ccy, quantity);
    }
}
