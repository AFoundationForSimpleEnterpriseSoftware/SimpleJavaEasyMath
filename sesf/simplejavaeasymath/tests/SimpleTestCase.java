package sesf.simplejavaeasymath.tests;

public class SimpleTestCase {
    /**
     * The SimpleTestCase represents a single case to be used when testing.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * name is a friendly name for this test case that will be displayed when
     * the test fails.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    public final String name = "Default test case";

    public SimpleTestCase() {
        /**
         * SimpleTestCase's default constructor does nothing.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
    }

    public void preTest() {
        /**
         * preTest is a method where one might put test initialization steps.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
    }

    public boolean runTest() {
        /**
         * runTest is the method where the actual test takes place. It should
         * return true if the test passed. Conversely, it should return false
         * if the test fails.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @return boolean true if the test passes, otherwise false
         */
        return false;
    }

    public void postTest() {
        /**
         * postTest is a method where one might perform cleanup tasks after the
         * test, such as destroying any data.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
    }
}
