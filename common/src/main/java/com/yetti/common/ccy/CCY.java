package com.yetti.common.ccy;

import java.util.Optional;

public interface CCY {

    String getLongName();

    static Optional<CCY> lookUp(String name) {

        Optional<CCY> fiatCCY = FiatCCY.lookUp(name);

        if (fiatCCY.isPresent()) {
            return fiatCCY;
        }

        return CryptoCCY.lookUp(name);

    }

}
