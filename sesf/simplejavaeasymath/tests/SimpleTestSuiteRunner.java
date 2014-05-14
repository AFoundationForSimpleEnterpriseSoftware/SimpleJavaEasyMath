package sesf.simplejavaeasymath.tests;

/**
 * We need to import the List interface, as we need to have some way of
 * accepting a list of tests to run.
 * @author Fox Wilson
 * @version 1
 * @since 0.0.1
 */
import java.util.List;

/**
 * We need to import the LinkedList class for storing test results.
 * @author Fox Wilson
 * @version 1
 * @since 0.0.1
 */
import java.util.LinkedList;

public class SimpleTestSuiteRunner {
    /**
     * The SimpleTestSuiteRunner runs not one, not two, but a whole suite of
     * tests!
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */

    /**
     * We keep two LinkedLists of tests: one holds the tests that passed, the
     * other the tests that failed.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    private LinkedList<SimpleTestCase> passedTests;
    private LinkedList<SimpleTestCase> failedTests;

    /**
     * We also keep a List of tests that we are running.
     * @author Fox Wilson
     * @version 1
     * @since 0.0.1
     */
    private List<SimpleTestCase> testsInSuite;

    public SimpleTestSuiteRunner(List<SimpleTestCase> testsInSuite) {
        /**
         * This constructor initializes the lists to hold tests that passed/
         * failed, and stores the tests to run.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         * @param testsInSuite a List of SimpleTestCases
         */
        this.testsInSuite = testsInSuite;
        passedTests = new LinkedList<SimpleTestCase>();
        failedTests = new LinkedList<SimpleTestCase>();
    }

    public void run() {
        /**
         * This method runs the tests and stores the results.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        for(SimpleTestCase test : testsInSuite) {
            System.out.print("Running " + test.getName() + "... ");
            SimpleTestRunner runner = new SimpleTestRunner(test);
            boolean result = runner.run();
            if(result) {
                System.out.println("passed.");
                passedTests.add(test);
            }
            else {
                System.out.println("failed.");
                failedTests.add(test);
            }
        }
    }

    public void display() {
        /**
         * This method displays the results of running the tests.
         * @author Fox Wilson
         * @version 1
         * @since 0.0.1
         */
        System.out.println("Tests that passed:");
        for(SimpleTestCase test : passedTests) {
            System.out.println("(PASS) " + test.getName());
        }
        System.out.println();
        System.out.println("Tests that failed:");
        for(SimpleTestCase test : failedTests) {
            System.out.println("(FAIL) " + test.getName());
        }
        System.out.println();
        System.out.println(passedTests.size() + " pass, " + failedTests.size() + " fail");
    }
}
