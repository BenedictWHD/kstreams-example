package com.yetti.externalmessageprocessor.externalmessagereciever;

import com.yetti.common.externalmessage.ExternalWebMessage;
import com.yetti.common.internalmessage.InternalMessage;
import com.yetti.externalmessageprocessor.externaltointernalparser.VoiceParser;
import com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser.InvalidFieldException;

public class VoiceMessageReceiver implements MessageReceiver<ExternalWebMessage> {

    private final VoiceParser voiceParser = new VoiceParser();

    @Override
    public InternalMessage processExternalMessage(ExternalWebMessage externalMessage) {
        try {
            return voiceParser.parse(externalMessage);
        } catch (InvalidFieldException e) {
            e.printStackTrace();
            return null;
        }
    }
}
