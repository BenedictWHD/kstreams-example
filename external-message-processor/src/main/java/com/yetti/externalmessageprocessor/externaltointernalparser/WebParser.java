package com.yetti.externalmessageprocessor.externaltointernalparser;


import com.yetti.common.ccy.CCY;
import com.yetti.common.externalmessage.ExternalWebMessage;
import com.yetti.common.internalmessage.InternalMessage;
import com.yetti.common.internalmessage.InternalMessageType;
import com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser.*;
import com.yetti.externalmessageprocessor.internalmessagecreator.InternalMessageFactory;

import java.math.BigDecimal;

public class WebParser implements ExternalMessageParser<ExternalWebMessage> {

    private final Parser<String, String> accountNumberParser = new AccountNumberParser();
    private final Parser<String, CCY> ccyParser = new CCYParser();
    private final Parser<String, BigDecimal> quantityParser = new QuantityParser();
    private final FieldParser<InternalMessageType> messageTypeParser = new MessageTypeParser();
    private final InternalMessageFactory internalMessageBuilderFactory = new InternalMessageFactory();

    @Override
    public InternalMessage parse(ExternalWebMessage externalMessage) throws InvalidFieldException {
        String accountNumberFrom = accountNumberParser.parse(externalMessage.getNumberFrom());

        String accountNumberTo = accountNumberParser.parse(externalMessage.getNumberTo());

        CCY ccy = ccyParser.parse(externalMessage.getCcy());

        BigDecimal quantity = quantityParser.parse(externalMessage.getQuantity());

        InternalMessageType messageType = messageTypeParser.parse(externalMessage.getMessageType());

        return internalMessageBuilderFactory.getInternalMessageBuilder(messageType).build(accountNumberFrom, accountNumberTo, quantity, ccy);
    }
}
