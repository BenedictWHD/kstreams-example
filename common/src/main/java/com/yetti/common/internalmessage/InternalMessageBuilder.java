package com.yetti.common.internalmessage;


import com.yetti.common.ccy.CCY;

import java.math.BigDecimal;

public interface InternalMessageBuilder<T extends InternalMessage> {

    public T build(String accountFrom, String accountTo, BigDecimal quantity, CCY currency);

}
