package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculator {

   @Test
   public void zeroOnEmpty() {
	   assertEquals(0,Calculator.add(""));
   }
	
   @Test
   public void returnNumberIfNumber() {
	   assertEquals(1, Calculator.add("1"));
   }	
   	
   @Test
   public void returnSumOnTwoNumber() {
	   assertEquals(30, Calculator.add("10,20"));
   }	
	
   @Test
   public void returnSumOfMultipleNumbers() {
	   assertEquals(50, Calculator.add("10,20,20"));
   }	
	
   @Test
   public void acceptNewLineAsValidDelimiter() {
	   assertEquals(10, Calculator.add("2,2\n6"));
   }	
}
