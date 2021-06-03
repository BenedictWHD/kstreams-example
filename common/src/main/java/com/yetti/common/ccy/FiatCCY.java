package com.yetti.common.ccy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum FiatCCY implements CCY {

    NPR("Nepali Rupee"),
    GBP("Great British Pound");

    private final String longName;

    private static final Map<String, CCY> lookup = new HashMap<>();

    static {
        for (FiatCCY value : FiatCCY.values()) {
            lookup.put(value.name(), value);
        }
    }

    FiatCCY(String longName) {
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
