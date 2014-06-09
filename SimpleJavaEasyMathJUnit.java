import sesf.simplejavaeasymath.*;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SimpleJavaEasyMathJUnit {
   private SimpleNumber one;
   private SimpleNumber two;
   /** Fixture initialization **/
   @Before public void setUp() {
      one=new SimpleDouble("1.0");
      two=new SimpleDouble("2.0");
   }

   /** A test that checks the addition of 1+2. **/
   @Test public void defaultTest() {
      SimpleOperator adder=new SimpleAddition();
      SimpleResult r=SimpleCalculationRunner.runTwo(adder,one,two);
      assertEquals(r.getNumber().getDoublValue(),3.0,1E-6);
   }
}
