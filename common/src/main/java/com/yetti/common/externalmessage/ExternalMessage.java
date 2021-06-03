package com.yetti.common.externalmessage;

import lombok.Data;

@Data
public abstract class ExternalMessage {

    private final String id;
    private final ExternalMessageSource externalMessageSource;
    private final String messageType;
    private final String numberFrom;
    private final String numberTo;
    private final String ccy;
    private final String quantity;

}
