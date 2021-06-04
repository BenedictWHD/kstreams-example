package externalmessagereciever;

import data.internalmessage.InternalMessage;
import data.externalmessage.ExternalMessage;

public interface MessageReceiver<T extends ExternalMessage> {

    InternalMessage processExternalMessage(T externalMessage);

}
