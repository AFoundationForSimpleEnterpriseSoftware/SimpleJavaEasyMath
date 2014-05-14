package sesf.simplejavaeasymath.tests;

import sesf.simplejavaeasymath.*;

public class SJEMDivisionTestCase extends SimpleTestCase {
    public String getName() { return "Division: 4 / 2"; }
    public boolean runTest() {
        SimpleNumber one = new SimpleInteger(4);
        SimpleNumber two = new SimpleInteger(2);
        SimpleNumberCollection coll = new SimpleNumberCollection();
        coll.add(one);
        coll.add(two);
        SimpleOperator divider = new SimpleDivision();
        SimpleResult result = divider.calculate(coll);
        SimpleNumber resultNum = result.getNumber();
        return (resultNum.getIntegerValue(true) == 2);
    }
}
