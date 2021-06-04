package com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser;


import com.yetti.common.internalmessage.InternalMessageType;

public class MessageTypeParser implements FieldParser<InternalMessageType> {
    @Override
    public InternalMessageType parse(String toBeParsed) throws InvalidFieldException {
        return InternalMessageType.lookUp(toBeParsed).orElseThrow(() -> new InvalidFieldException("InternalMessageType field is invalid: " + toBeParsed));
    }
}
