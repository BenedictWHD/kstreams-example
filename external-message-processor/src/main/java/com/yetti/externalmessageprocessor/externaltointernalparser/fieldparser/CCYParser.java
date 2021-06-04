package externaltointernalparser.fieldparser;

import data.ccy.CCY;

public class CCYParser implements FieldParser<CCY> {

    @Override
    public CCY parse(String toBeParsed) throws InvalidFieldException {
        return CCY.lookUp(toBeParsed).orElseThrow(() -> new InvalidFieldException("CCY field is invalid: " + toBeParsed));
    }
}
