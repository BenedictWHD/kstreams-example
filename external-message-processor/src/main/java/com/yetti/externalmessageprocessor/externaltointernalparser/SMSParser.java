package externaltointernalparser;

import data.ccy.CCY;
import externaltointernalparser.fieldparser.*;
import data.internalmessage.InternalMessage;
import data.internalmessage.InternalMessageType;
import data.externalmessage.ExternalSMSMessage;
import internalmessagecreator.InternalMessageFactory;

import java.math.BigDecimal;
import java.util.UUID;

public class SMSParser implements ExternalMessageParser<ExternalSMSMessage> {

    private final FieldParser<String> accountNumberParser = new AccountNumberParser();
    private final FieldParser<CCY> ccyParser = new CCYParser();
    private final FieldParser<BigDecimal> quantityParser = new QuantityParser();
    private final FieldParser<InternalMessageType> messageTypeParser = new MessageTypeParser();
    private final InternalMessageFactory internalMessageBuilderFactory = new InternalMessageFactory();

    @Override
    public InternalMessage parse(ExternalSMSMessage externalMessage) throws InvalidFieldException {

        String accountNumberFrom = accountNumberParser.parse(externalMessage.getNumberFrom());

        String accountNumberTo = accountNumberParser.parse(externalMessage.getNumberTo());

        CCY ccy = ccyParser.parse(externalMessage.getCcy());

        BigDecimal quantity = quantityParser.parse(externalMessage.getQuantity());

        InternalMessageType messageType = messageTypeParser.parse(externalMessage.getMessageType());

        return internalMessageBuilderFactory.getInternalMessageBuilder(messageType).build(accountNumberFrom, accountNumberTo, quantity, ccy);

    }
}
