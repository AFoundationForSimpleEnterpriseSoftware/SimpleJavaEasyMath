package sesf.simplejavaeasymath.tests;
import java.util.LinkedList;

public class SJEMTestSuiteRunner {
    public static void main(String[] args) {
        LinkedList<SimpleTestCase> tests = new LinkedList<SimpleTestCase>();
        tests.add(new SJEMAdditionTestCase());
        tests.add(new SJEMSubtractionTestCase());
        tests.add(new SJEMMultiplicationTestCase());
        tests.add(new SJEMDivisionTestCase());
        SimpleTestSuiteRunner runner = new SimpleTestSuiteRunner(tests);
        runner.run();
        runner.display();
    }
}
