package com.yetti.common.ccy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum CryptoCCY implements CCY {

    NTTL("Nettle"),
    BTC("Bitcoin");

    private final String longName;

    private static final Map<String, CCY> lookup = new HashMap<>();

    static {
        for (CryptoCCY value : CryptoCCY.values()) {
            lookup.put(value.name(), value);
        }
    }

    CryptoCCY(String longName) {
        this.longName = longName;
    }

    @Override
    public String getLongName() {
        return this.longName;
    }

    public static Optional<CCY> lookUp(String name) {
        return Optional.ofNullable(lookup.get(name));
    }
}
