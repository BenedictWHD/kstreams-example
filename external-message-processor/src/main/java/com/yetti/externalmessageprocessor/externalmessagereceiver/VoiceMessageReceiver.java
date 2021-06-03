package com.yetti.externalmessageprocessor.externalmessagereceiver;

import com.yetti.externalmessageprocessor.externaltointernalparser.VoiceParser;
import com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser.InvalidFieldException;
import com.yetti.common.externalmessage.ExternalVoiceMessage;
import com.yetti.common.internalmessage.InternalMessage;

public class VoiceMessageReceiver implements MessageReceiver<ExternalVoiceMessage> {

    private final VoiceParser voiceParser = new VoiceParser();

    @Override
    public InternalMessage processExternalMessage(ExternalVoiceMessage externalMessage) {
        try {
            return voiceParser.parse(externalMessage);
        } catch (InvalidFieldException e) {
            e.printStackTrace();
            return null;
        }
    }
}
