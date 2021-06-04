package externaltointernalparser;

import externaltointernalparser.fieldparser.InvalidFieldException;

public interface Parser<T, U> {

    U parse(T toBeParsed) throws InvalidFieldException;

}
