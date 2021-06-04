package com.yetti.externalmessageprocessor.externalmessagereciever;

import com.yetti.common.externalmessage.ExternalWebMessage;
import com.yetti.common.internalmessage.InternalMessage;
import com.yetti.externalmessageprocessor.externaltointernalparser.WebParser;
import com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser.InvalidFieldException;

public class WebMessageReceiver implements MessageReceiver<ExternalWebMessage> {

    private final WebParser webParser = new WebParser();

    @Override
    public InternalMessage processExternalMessage(ExternalWebMessage externalMessage) {
        try {
            return webParser.parse(externalMessage);
        } catch (InvalidFieldException e) {
            e.printStackTrace();
            return null;
        }
    }
}
