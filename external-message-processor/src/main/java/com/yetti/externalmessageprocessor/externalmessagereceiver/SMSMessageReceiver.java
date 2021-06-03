package com.yetti.externalmessageprocessor.externalmessagereceiver;

import com.yetti.externalmessageprocessor.externaltointernalparser.SMSParser;
import com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser.InvalidFieldException;
import com.yetti.common.externalmessage.ExternalSMSMessage;
import com.yetti.common.internalmessage.InternalMessage;

public class SMSMessageReceiver implements MessageReceiver<ExternalSMSMessage> {

    private final com.yetti.externalmessageprocessor.externaltointernalparser.SMSParser SMSParser = new SMSParser();

    @Override
    public InternalMessage processExternalMessage(ExternalSMSMessage externalMessage) {

        try {
            return SMSParser.parse(externalMessage);
        } catch (InvalidFieldException e) {
            e.printStackTrace();
            return null;
        }

    }
}
