public class SimpleDouble implements SimpleNumber<Double> {
    /**
     * Represents a double, simply.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * Stores the value of this SimpleDouble.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    private double value;

    public SimpleDouble() {
        /**
         * Creates a new SimpleDouble, using default values for all of the
         * fields.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        this.value = 0.0;
    }

    public SimpleDouble(double value) {
        /**
         * Creates a new SimpleDouble, using the value passed in as the value
         * that this SimpleDouble represents.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        this.value = value;
    }
    
    public SimpleDouble(String value) {
        /**
         * Creates a new SimpleDouble, using the string passed in as the value
         * that this SimpleDouble represents.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        this.value = Double.parseDouble(value);
    }

    public double getDoubleValue() {
        /**
         * Gets the primitive double value of this SimpleDouble.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @return a double representing the value of this SimpleDouble
         */
        return this.value;
    }

    public int getIntegerValue(boolean useTruncation) {
        /**
         * Gets the integer value of this SimpleDouble.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param useTruncation if true, use truncation instead of rounding.
         * @return an int representing the value of this SimpleDouble
         */
        if(useTruncation) {
            /**
             * If we're using truncation, all we need to do is cast to an int.
             */
            return (int)this.value;
        }
        else {
            /**
             * If we're not using truncation, use our own rounding methods.
             * First, get the truncated value.
             */
            int theTruncatedValue = getIntegerValue(true);
            /**
             * Cast it to a double to make sure we don't lose precision.
             */
            double theTruncatedValueAsADouble = (double)theTruncatedValue;
            /**
             * Get the decimal part of our value.
             */
            double theDecimalPartOfOurValue = this.value - theTruncatedValueAsADouble;
            /**
             * If the decimal part is greater than or equal to 0.5, we add one
             * to theTruncatedValue and return. Otherwise, don't add one at all
             * but still return theTruncatedValue.
             */

            /**
             * TODO: move this logic to the RounderConfiguration class
             */
            if(theDecimalPartOfOurValue >= 0.5) {
                theTruncatedValue = theTruncatedValue + 1;
                return theTruncatedValue;
            }
            else {
                return theTruncatedValue;
            }
        }
    }

    public Double getWrappedValue() {
        /**
         * Gets the value of this SimpleDouble using Java's Double wrapper
         * class.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @return a Double
         */
        return new Double(this.value);
    }

    public SimpleCompareResult compareTo(SimpleNumber other) {
        /**
         * Compare this SimpleDouble with a SimpleNumber.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param other a SimpleNumber to compare against
         * @return a SimpleCompareResult representing the result of the
         * comparison
         */
        if(this.getDoubleValue() > other.getDoubleValue()) {
            /**
             * Check to see if this SimpleDouble is greater than the
             * SimpleNumber we are comparing against.
             */
            return SimpleCompareResult.GREATER_THAN;
        }

        else if(this.getDoubleValue() < other.getDoubleValue()) {
            /**
             * Check to see if this SimpleDouble is less than the SimpleNumber
             * we are comparing against.
             */
            return SimpleCompareResult.LESS_THAN;
        }

        else if(this.getDoubleValue() == other.getDoubleValue()) {
            /**
             * Check to see if this SimpleDouble is equal to the SimpleNumber
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
