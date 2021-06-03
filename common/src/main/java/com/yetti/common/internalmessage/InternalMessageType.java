package com.yetti.common.internalmessage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum InternalMessageType {

    TRANSACTION,
    BALANCE_QUERY,
    ACCOUNT_CREATION;

    private static final Map<String, InternalMessageType> lookup = new HashMap<>();

    static {
        for (InternalMessageType value : InternalMessageType.values()) {
            lookup.put(value.name(), value);
        }
    }

    public static Optional<InternalMessageType> lookUp(String name) {
        return Optional.ofNullable(lookup.get(name));
    }

}
