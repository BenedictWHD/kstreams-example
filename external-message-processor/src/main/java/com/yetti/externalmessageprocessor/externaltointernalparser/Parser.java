package com.yetti.externalmessageprocessor.externaltointernalparser;

import com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser.InvalidFieldException;

public interface Parser<T, U> {

    U parse(T toBeParsed) throws InvalidFieldException;

}
