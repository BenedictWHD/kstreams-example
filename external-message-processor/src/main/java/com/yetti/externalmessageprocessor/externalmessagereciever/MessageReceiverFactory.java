package externalmessagereciever;

import data.externalmessage.ExternalMessage;
import data.externalmessage.ExternalMessageSource;

@SuppressWarnings("unchecked")
public class MessageReceiverFactory {

    private final MessageReceiver smsMessageReceiver = new SMSMessageReceiver();
    private final MessageReceiver voiceMessageReceiver = new VoiceMessageReceiver();

    public MessageReceiver<ExternalMessage> getMessageReceiver(ExternalMessageSource messageType) {

        switch (messageType) {
            case SMS:
                return smsMessageReceiver;
            case VOICE:
                return voiceMessageReceiver;
        }

        return null;
    }

}
