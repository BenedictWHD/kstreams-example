package com.yetti.common.internalmessage;


import com.yetti.common.ccy.CCY;

import java.math.BigDecimal;

public class AccountCreationMessage extends InternalMessage {
    public AccountCreationMessage(String accountFrom, String accountTo, BigDecimal quantity, CCY currency) {
        super(InternalMessageType.ACCOUNT_CREATION, accountFrom, accountTo, quantity, currency);
    }

    public static class AccountCreationMessageBuilder implements InternalMessageBuilder<AccountCreationMessage> {
        @Override
        public AccountCreationMessage build(String accountFrom, String accountTo, BigDecimal quantity, CCY currency) {
            return new AccountCreationMessage(accountFrom, accountTo, quantity, currency);
        }
    }
}
