/**
 * Import the List interface. We need this so we can build
 * SimpleNumberCollections out of any type of List.
 * @author Fox Wilson
 * @version 1
 * @since 0.0.1
 */
import java.util.List;

/**
 * Import the LinkedList class. New SimpleNumberCollections are backed by a
 * LinkedList.
 * @author Fox Wilson
 * @version 1
 * @since 0.0.1
 */
import java.util.LinkedList;

/**
 * Import the Iterator class. SimpleNumberCollections must return an iterator
 * so that other classes can loop through the elements in the
 * SimpleNumberCollection.
 * @author Fox Wilson
 * @version 1
 * @since 0.0.1
 */
import java.util.Iterator;

public class SimpleNumberCollection
/**
 * We can implement the Iterable interface to allow other parts of
 * SimpleJavaEasyMath to run for-each loops over our code.
 * @author Fox Wilson
 * @version 1
 * @since 0.0.1
 */
    implements Iterable {
    /**
     * A SimpleNumberCollection represents a collection of numbers. Operations
     * can be performed on the numbers in a SimpleNumberCollection.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    
    /**
     * The backing of the SimpleNumberCollection is a LinkedList. This field
     * stores the LinkedList, which contains SimpleNumbers.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    LinkedList<SimpleNumber> numberList;

    public SimpleNumberCollection() {
        /**
         * Create a new SimpleNumberCollection. This constructor creates an
         * empty SimpleNumberCollection.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        numberList = new LinkedList<SimpleNumber>();
    }

    public SimpleNumberCollection(List<SimpleNumber> numberList) {
        /**
         * Create a new SimpleNumberCollection based on a List of
         * SimpleNumbers.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        this.numberList = new LinkedList<SimpleNumber>();

        /**
         * Add all of the numbers from numberList to this.numberList.
         */
        this.numberList.addAll(numberList);
    }

    public SimpleNumber add(SimpleNumber n) {
        /**
         * Adds a SimpleNumber to this SimpleNumberCollection.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param n the SimpleNumber to add to the SimpleNumberCollection.
         * @return the SimpleNumber added, or "null" if there was a problem
         * adding the SimpleNumber to the SimpleNumberCollection.
         */
        try {
            /**
             * Actually add the number to the list.
             */
            boolean addResult = this.numberList.add(n);

            /**
             * If addResult is false, there was a problem...
             */
            if(!addResult)
                /**
                 * ...so we need to return null.
                 */
                return null;

            /**
             * If we got this far, then we can safely return success.
             */
            return n;
        }
        catch(Exception e) {
            /**
             * If there was an error, we need to return null.
             */
            return null;
        }
    }

    public Iterator<SimpleNumber> iterator() {
        /**
         * Get an iterator over the SimpleNumbers contained in this
         * SimpleNumberCollection.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @return an iterator over SimpleNumbers
         */
        return (Iterator<SimpleNumber>)this.numberList.iterator();
    }
}
