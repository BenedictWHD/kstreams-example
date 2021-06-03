package com.yetti.common.internalmessage;


import com.yetti.common.ccy.CCY;

import java.math.BigDecimal;

public class BalanceQueryMessage extends InternalMessage {
    public BalanceQueryMessage(String accountFrom, String accountTo, BigDecimal quantity, CCY currency) {
        super(InternalMessageType.BALANCE_QUERY, accountFrom, accountTo, quantity, currency);
    }

    public static class BalanceQueryMessageBuilder implements InternalMessageBuilder<BalanceQueryMessage> {
        @Override
        public BalanceQueryMessage build(String accountFrom, String accountTo, BigDecimal quantity, CCY currency) {
            return new BalanceQueryMessage(accountFrom, accountTo, quantity, currency);
        }
    }
}
