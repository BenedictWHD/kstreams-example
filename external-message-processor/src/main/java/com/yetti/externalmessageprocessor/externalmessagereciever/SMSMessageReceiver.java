package externalmessagereciever;

import data.internalmessage.InternalMessage;
import externaltointernalparser.SMSParser;
import externaltointernalparser.fieldparser.InvalidFieldException;
import data.externalmessage.ExternalSMSMessage;

public class SMSMessageReceiver implements MessageReceiver<ExternalSMSMessage> {

    private final externaltointernalparser.SMSParser SMSParser = new SMSParser();

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
