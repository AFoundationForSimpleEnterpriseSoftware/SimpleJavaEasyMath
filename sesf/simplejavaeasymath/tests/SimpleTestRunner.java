package sesf.simplejavaeasymath.tests;

public class SimpleTestRunner {
    /**
     * The SimpleTestRunner runs a single SimpleTestCase and reports the result
     * on standard output.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * test holds the SimpleTestCase that this SimpleTestRunner will test.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    private SimpleTestCase test;

    public SimpleTestRunner(SimpleTestCase test) {
        /**
         * This constructor takes a single test and stores it.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param test a SimpleTestCase that this SimpleTestRunner will test
         */
        this.test = test;
    }

    public boolean run() {
        /**
         * The run method actually runs the test.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        boolean result;

        test.preTest();
        result = test.runTest();
        test.postTest();

        return result;
    }
}
