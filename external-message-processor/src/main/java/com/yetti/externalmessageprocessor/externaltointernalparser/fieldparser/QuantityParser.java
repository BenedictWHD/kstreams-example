package com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser;

import java.math.BigDecimal;

public class QuantityParser implements FieldParser<BigDecimal> {
    @Override
    public BigDecimal parse(String toBeParsed) throws InvalidFieldException {
        try {
            return new BigDecimal(toBeParsed);
        } catch (NumberFormatException numberFormatException) {
            throw new InvalidFieldException(numberFormatException);
        }
    }
}
