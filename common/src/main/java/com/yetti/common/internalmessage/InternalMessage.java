package com.yetti.common.internalmessage;

import com.yetti.common.ccy.CCY;
import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class InternalMessage {//Parsed message

    private final InternalMessageType messageType;
    private final String accountFrom;
    private final String accountTo;
    private final BigDecimal quantity;
    private final CCY currency;

}

