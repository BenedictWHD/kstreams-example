package internalmessagecreator;

import data.internalmessage.*;

@SuppressWarnings("unchecked")
public class InternalMessageFactory {

    TransactionMessage.TransactionMessageBuilder transactionMessageBuilder = new TransactionMessage.TransactionMessageBuilder();
    AccountCreationMessage.AccountCreationMessageBuilder InternalMessageBuilder = new AccountCreationMessage.AccountCreationMessageBuilder();
    BalanceQueryMessage.BalanceQueryMessageBuilder balanceQueryMessageBuilder = new BalanceQueryMessage.BalanceQueryMessageBuilder();

    public data.internalmessage.InternalMessageBuilder getInternalMessageBuilder(InternalMessageType internalMessageType) {

        switch (internalMessageType) {

            case TRANSACTION -> {
                return transactionMessageBuilder;
            }
            case BALANCE_QUERY -> {
                return balanceQueryMessageBuilder;
            }
            case ACCOUNT_CREATION -> {
                return InternalMessageBuilder;
            }
        }

        return null;
    }

}
