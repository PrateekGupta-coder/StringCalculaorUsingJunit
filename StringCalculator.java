package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculator {

   @Test
   public void zeroOnEmpty() {
	   assertEquals(0,Calculator.add(""));
   }
	
}
