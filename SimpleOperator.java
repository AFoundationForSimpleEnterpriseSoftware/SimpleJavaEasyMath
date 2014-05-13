public interface SimpleOperator {
    /**
     * SimpleOperators perform mathematical operations on some SimpleNumbers.
     * This is done by passing the SimpleOperator a SimpleNumberCollection.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * Perform the actual operation. Return a SimpleResult.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     * @param numbers a SimpleNumberCollection to operate on
     * @return a SimpleResult object representing the result of the operation
     */
    SimpleResult calculate(SimpleNumberCollection numbers);
}
