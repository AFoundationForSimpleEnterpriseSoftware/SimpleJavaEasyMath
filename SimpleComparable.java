public interface SimpleComparable<E> {
    /**
     * An interface to compare two things simply. A type argument may be
     * specified to indicate the type of the two things to compare.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * Compares something against this thing. Returns a SimpleCompareResult.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     * @param other the thing to compare against this thing
     * @return a SimpleCompareResult representing the result of the comparison
     */
    SimpleCompareResult compareTo(E other);
}
