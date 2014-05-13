package com.github.simpleenterprisesoftwarefoundation.simplejavaeasymath;

public enum SimpleCompareResult {
    /**
     * An enum type to represent comparison results from the SimpleComparable
     * interface.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * An enum value to indicate that the result of the comparison was "less
     * than."
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    LESS_THAN,

    /** An enum value to indicate that the result of the comparison was
     * "greater than."
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    GREATER_THAN,

    /**
     * An enum value to indicate that the result of the comparison was "equal
     * to."
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    EQUAL_TO,

    /**
     * An enum value to indicate that the result of the comparison was
     * "unknown", that is, the objects were unable to be compared.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    UNKNOWN
}
