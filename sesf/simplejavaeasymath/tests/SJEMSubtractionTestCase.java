package sesf.simplejavaeasymath.tests;

import sesf.simplejavaeasymath.*;

public class SJEMSubtractionTestCase extends SimpleTestCase {
    public String getName() { return "Subtraction: 2 - 1"; }
    public boolean runTest() {
        SimpleNumber one = new SimpleInteger(2);
        SimpleNumber two = new SimpleInteger(1);
        SimpleNumberCollection coll = new SimpleNumberCollection();
        coll.add(one);
        coll.add(two);
        SimpleOperator subtracter = new SimpleSubtraction();
        SimpleResult result = subtracter.calculate(coll);
        SimpleNumber resultNum = result.getNumber();
        return (resultNum.getIntegerValue(true) == 1);
    }
}
