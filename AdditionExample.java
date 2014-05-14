import sesf.simplejavaeasymath.*;

public class AdditionExample {
    public static void main(String[] args) {
        SimpleNumber one = new SimpleDouble(args[0]);
        SimpleNumber two = new SimpleDouble(args[1]);

        SimpleOperator adder = new SimpleAddition();

        SimpleResult r = SimpleCalculationRunner.runTwo(adder, one, two);
        System.out.println(r.getNumber().getDoubleValue());
    }
}
