package sesf.simplejavaeasymath;

public class SimpleInteger implements SimpleNumber<Integer> {
    /**
     * Represents an integer, simply.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * Stores the value of this SimpleInteger.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    private int value;

    public SimpleInteger() {
        /**
         * Creates a new SimpleInteger, using default values for all of the
         * fields.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        this.value = 0;
    }

    public SimpleInteger(int value) {
        /**
         * Creates a new SimpleInteger, using the value passed in as the value
         * that this SimpleInteger represents.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        this.value = value;
    }

    public SimpleInteger(String value) {
        /**
         * Creates a new SimpleInteger, using the string passed in as the value
         * that this SimpleInteger represents.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        this.value = Integer.parseInt(value);
    }

    public double getDoubleValue() {
        /**
         * Gets the primitive double value of this SimpleInteger.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @return a double representing the value of this SimpleInteger
         */
        return (double)this.value;
    }

    public int getIntegerValue(boolean useTruncation) {
        /**
         * Gets the integer value of this SimpleInteger.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param useTruncation if true, use truncation instead of rounding.
         * However, since this is an integer, it doesn't matter.
         * @return an integer representing the value of this SimpleInteger
         */
        return this.value;
    }

    public Integer getWrappedValue() {
        /**
         * Gets the value of this SimpleInteger using Java's Integer wrapper
         * class.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @return an Integer
         */
        return new Integer(this.value);
    }

    public SimpleCompareResult compareTo(SimpleNumber other) {
        /**
         * Compare this SimpleInteger with a SimpleNumber.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param other a SimpleNumber to compare against
         * @return a SimpleCompareResult representing the result of the
         * comparison
         */
        if(this.getDoubleValue() > other.getDoubleValue()) {
            /**
             * Check to see if this SimpleInteger is greater than the
             * SimpleNumber we are comparing against.
             */
            return SimpleCompareResult.GREATER_THAN;
        }

        else if(this.getDoubleValue() < other.getDoubleValue()) {
            /**
             * Check to see if this SimpleInteger is less than the SimpleNumber
             * we are comparing against.
             */
            return SimpleCompareResult.LESS_THAN;
        }

        else if(this.getDoubleValue() == other.getDoubleValue()) {
            /**
             * Check to see if this SimpleInteger is equal to the SimpleNumber
             * we are comparing against.
             */
            return SimpleCompareResult.EQUAL_TO;
        }

        else {
            /**
             * It looks like we've failed at comparing numbers, so return
             * UNKNOWN.
             */
            return SimpleCompareResult.UNKNOWN;
        }
    }

}
