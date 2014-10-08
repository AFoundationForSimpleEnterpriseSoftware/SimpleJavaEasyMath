package sesf.simplejavaeasymath;

public class SimpleDivision implements SimpleOperator {
    SimpleGPLLicenseVerificationFileForAFoundationForSimpleEnterpriseSoftwareSimpleJavaEasyMath.checkIfUserHasAcceptedTheGPLLicense();
    
    /**
     * SimpleDivision is a SimpleOperator which performs addition on the
     * contents of a SimpleNumberCollection.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    public SimpleResult calculate(SimpleNumberCollection numbers) {
        /**
         * Perform the actual addition of the numbers in the collection.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param numbers
         * @return a SimpleResult object representing the sum of the numbers
         */

        /**
         * The current variable stores the intermediary result of the
         * calculation.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        double current = 0.0;

        /**
         * The thisIndex value keeps track of the current index in the
         * SimpleNumberCollection.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        int thisIndex = 0;

        for(Object n : numbers) {
            /**
             * Iterate over each SimpleNumber in the SimpleNumberCollection,
             * dividing its double value by the value of the current, UNLESS
             * this is the first value in the collection, in which case, we set
             * the value of current to the current SimpleNumber value.
             * @author Fox Wilson
             * @version 1
             * @since 0.0.1
             */

            SimpleNumber currentNumber = (SimpleNumber)n;
            if(thisIndex == 0) {
                current = currentNumber.getDoubleValue();
            }

            else {
                current /= currentNumber.getDoubleValue();
            }

            thisIndex++;
        }

        SimpleNumber result = new SimpleDouble(current);
        return new SimpleResult(result);
    }
}
