package com.yetti.externalmessageprocessor.externalmessagereceiver;


import com.yetti.common.externalmessage.ExternalMessage;
import com.yetti.common.internalmessage.InternalMessage;

public interface MessageReceiver<T extends ExternalMessage> {

    InternalMessage processExternalMessage(T externalMessage);

}
