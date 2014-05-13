package com.github.simpleenterprisesoftwarefoundation.simplejavaeasymath;

public class SimpleAddition implements SimpleOperator {
    /**
     * SimpleAddition is a SimpleOperator which performs addition on the
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

        for(Object n : numbers) {
            /**
             * Iterate over each SimpleNumber in the SimpleNumberCollection,
             * adding its double value to the value of current.
             * @author Fox Wilson
             * @version 1
             * @since 0.0.1
             */
            SimpleNumber currentNumber = (SimpleNumber)n;
            current += currentNumber.getDoubleValue();
        }

        SimpleNumber result = new SimpleDouble(current);
        return new SimpleResult(result);
    }
}
