package sesf.simplejavaeasymath.tests;

import sesf.simplejavaeasymath.*;

public class SJEMMultiplicationTestCase extends SimpleTestCase {
    public String getName() { return "Multiplication: 4 * 4"; }
    public boolean runTest() {
        SimpleNumber one = new SimpleInteger(4);
        SimpleNumber two = new SimpleInteger(4);
        SimpleNumberCollection coll = new SimpleNumberCollection();
        coll.add(one);
        coll.add(two);
        SimpleOperator multiplier = new SimpleMultiplication();
        SimpleResult result = multiplier.calculate(coll);
        SimpleNumber resultNum = result.getNumber();
        return (resultNum.getIntegerValue(true) == 16);
    }
}
