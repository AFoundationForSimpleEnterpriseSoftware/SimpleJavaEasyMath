package sesf.simplejavaeasymath;

public interface SimpleNumber<E> extends SimpleComparable<SimpleNumber> {
    /**
     * An interface to define the methods that SimpleNumbers should have.
     * SimpleNumbers include SimpleDoubles and SimpleIntegers.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * Gets the double value of this SimpleNumber.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     * @return a double representing the value of this SimpleNumber
     */
    double getDoubleValue();

    /**
     * Gets the integer value of this SimpleNumber.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     * @param useTruncation if true, getIntegerValue should truncate instead of
     * rounding.
     * @return an int representing the value of this SimpleNumber
     */
    int getIntegerValue(boolean useTruncation);

    /**
     * Gets the "wrapper class" value of this SimpleNumber.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     * @return a Java wrapper class representing the value of this SimpleNumber
     * the type returned by this is determined by the type specifier passed to
     * SimpleNumber.
     */
    E getWrappedValue();
}
