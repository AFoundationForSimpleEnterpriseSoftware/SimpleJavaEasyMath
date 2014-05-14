import sesf.simplejavaeasymath;

public class AdditionExample {
    public static void main(String[] args) {
        SimpleNumber one = new SimpleNumber(args[0]);
        SimpleNumber two = new SimpleNumber(args[1]);

        SimpleOperator adder = new SimpleAddition();

        SimpleResult r = SimpleCalculationRunner.runTwo(adder, one, two);
        System.out.println(r.getDoubleValue());
    }
}
