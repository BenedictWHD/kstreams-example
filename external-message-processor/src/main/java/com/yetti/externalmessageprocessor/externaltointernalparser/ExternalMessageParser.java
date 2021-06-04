package externaltointernalparser;

import data.internalmessage.InternalMessage;
import data.externalmessage.ExternalMessage;

public interface ExternalMessageParser<T extends ExternalMessage> extends Parser<T, InternalMessage> {


}
