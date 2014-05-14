package sesf.simplejavaeasymath.tests;

import sesf.simplejavaeasymath.*;

public class SJEMAdditionTestCase extends SimpleTestCase {
    public String getName() { return "Addition: 1 + 1"; }
    public boolean runTest() {
        SimpleNumber one = new SimpleInteger(1);
        SimpleNumber two = new SimpleInteger(1);
        SimpleNumberCollection coll = new SimpleNumberCollection();
        coll.add(one);
        coll.add(two);
        SimpleOperator adder = new SimpleAddition();
        SimpleResult result = adder.calculate(coll);
        SimpleNumber resultNum = result.getNumber();
        return (resultNum.getIntegerValue(true) == 2);
    }
}
