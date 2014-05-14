package sesf.simplejavaeasymath;

public class SimpleCalculationRunner {
    /**
     * SimpleCalculationRunner contains methods to run calculations given a
     * SimpleOperator and SimpleNumber arguments.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    public static SimpleResult runOne(SimpleOperator operator, SimpleNumber one) {
        /**
         * runOne first creates a SimpleNumberCollection using the given
         * SimpleNumbers, then calls the SimpleOperator's calculate() method
         * using the SimpleNumberCollection created.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param operator the SimpleOperator to use
         * @param one the first SimpleNumber to use
         * @return a SimpleResult representing the results of the operation
         */
        SimpleNumberCollection coll = new SimpleNumberCollection();
        coll.add(one);
        return operator.calculate(coll);
    }

    public static SimpleResult runTwo(SimpleOperator operator, SimpleNumber one, SimpleNumber two) {
        /**
         * runOne first creates a SimpleNumberCollection using the given
         * SimpleNumbers, then calls the SimpleOperator's calculate() method
         * using the SimpleNumberCollection created.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param operator the SimpleOperator to use
         * @param one the first SimpleNumber to use
         * @param two the second SimpleNumber to use
         * @return a SimpleResult representing the results of the operation
         */
        SimpleNumberCollection coll = new SimpleNumberCollection();
        coll.add(one);
        coll.add(two);
        return operator.calculate(coll);
    }

    public static SimpleResult runThree(SimpleOperator operator, SimpleNumber one, SimpleNumber two, SimpleNumber three) {
        /**
         * runOne first creates a SimpleNumberCollection using the given
         * SimpleNumbers, then calls the SimpleOperator's calculate() method
         * using the SimpleNumberCollection created.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param operator the SimpleOperator to use
         * @param one the first SimpleNumber to use
         * @param two the second SimpleNumber to use
         * @param three the third SimpleNumber to use
         * @return a SimpleResult representing the results of the operation
         */
        SimpleNumberCollection coll = new SimpleNumberCollection();
        coll.add(one);
        coll.add(two);
        coll.add(three);
        return operator.calculate(coll);
    }

    public static SimpleResult runFour(SimpleOperator operator, SimpleNumber one, SimpleNumber two, SimpleNumber three, SimpleNumber four) {
        /**
         * runOne first creates a SimpleNumberCollection using the given
         * SimpleNumbers, then calls the SimpleOperator's calculate() method
         * using the SimpleNumberCollection created.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param operator the SimpleOperator to use
         * @param one the first SimpleNumber to use
         * @param two the second SimpleNumber to use
         * @param three the third SimpleNumber to use
         * @param four the fourth SimpleNumber to use
         * @return a SimpleResult representing the results of the operation
         */
        SimpleNumberCollection coll = new SimpleNumberCollection();
        coll.add(one);
        coll.add(two);
        coll.add(three);
        coll.add(four);
        return operator.calculate(coll);
    }
}
