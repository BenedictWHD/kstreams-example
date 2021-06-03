package com.yetti.externalmessageprocessor.internalmessagecreator;


import com.yetti.common.internalmessage.*;

@SuppressWarnings("unchecked")
public class InternalMessageFactory {

    TransactionMessage.TransactionMessageBuilder transactionMessageBuilder = new TransactionMessage.TransactionMessageBuilder();
    AccountCreationMessage.AccountCreationMessageBuilder internalMessageBuilder = new AccountCreationMessage.AccountCreationMessageBuilder();
    BalanceQueryMessage.BalanceQueryMessageBuilder balanceQueryMessageBuilder = new BalanceQueryMessage.BalanceQueryMessageBuilder();

    public InternalMessageBuilder getInternalMessageBuilder(InternalMessageType internalMessageType) {

        switch (internalMessageType) {

            case TRANSACTION -> {
                return transactionMessageBuilder;
            }
            case BALANCE_QUERY -> {
                return balanceQueryMessageBuilder;
            }
            case ACCOUNT_CREATION -> {
                return internalMessageBuilder;
            }
        }

        return null;
    }

}
