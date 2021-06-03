package com.yetti.common.internalmessage;

import com.yetti.common.ccy.CCY;

import java.math.BigDecimal;


public class TransactionMessage extends InternalMessage {
    public TransactionMessage(String accountFrom, String accountTo, BigDecimal quantity, CCY currency) {
        super(InternalMessageType.TRANSACTION, accountFrom, accountTo, quantity, currency);
    }

    public static class TransactionMessageBuilder implements InternalMessageBuilder<TransactionMessage> {
        @Override
        public TransactionMessage build(String accountFrom, String accountTo, BigDecimal quantity, CCY currency) {
            return new TransactionMessage(accountFrom, accountTo, quantity, currency);
        }
    }
}
