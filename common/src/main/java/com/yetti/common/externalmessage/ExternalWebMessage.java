package com.yetti.common.externalmessage;

public class ExternalWebMessage extends ExternalMessage {
    public ExternalWebMessage(String messageType, String numberFrom, String numberTo, String ccy, String quantity) {
        super("", ExternalMessageSource.WEB, messageType, numberFrom, numberTo, ccy, quantity);
    }
}
