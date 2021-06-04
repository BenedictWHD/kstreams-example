package com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser;


public class AccountNumberParser implements FieldParser<String> {
    @Override
    public String parse(String accountNumber) {//TODO: Implement a service to lookup the account numbers
        return accountNumber;
    }
}
