package com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser;


import com.yetti.common.ccy.CCY;

public class CCYParser implements FieldParser<CCY> {

    @Override
    public CCY parse(String toBeParsed) throws InvalidFieldException {
        return CCY.lookUp(toBeParsed).orElseThrow(() -> new InvalidFieldException("CCY field is invalid: " + toBeParsed));
    }
}
