package externaltointernalparser.fieldparser;

import data.internalmessage.InternalMessageType;

public class MessageTypeParser implements FieldParser<InternalMessageType> {
    @Override
    public InternalMessageType parse(String toBeParsed) throws InvalidFieldException {
        return InternalMessageType.lookUp(toBeParsed).orElseThrow(() -> new InvalidFieldException("InternalMessageType field is invalid: " + toBeParsed));
    }
}
