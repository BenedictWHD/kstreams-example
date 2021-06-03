package com.yetti.externalmessageprocessor.externaltointernalparser;


import com.yetti.common.externalmessage.ExternalMessage;
import com.yetti.common.internalmessage.InternalMessage;

public interface ExternalMessageParser<T extends ExternalMessage> extends Parser<T, InternalMessage> {


}
