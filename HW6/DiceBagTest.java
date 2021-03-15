import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class DiceBagTest {

	@Test
	public void testDie() {
		DiceBag test = new DiceBag();
		OrderDie die1 = new OrderDie("Red", "Red");
		test.addToken(die1);
		String expected = " Dice left: 1\nRed\n";
		Assert.assertEquals(expected, test.toString());
		//assertNotNull(test); I did this originally but realized probably not the best to verify output.
	}
	@Test
	public void testString() {
		DiceBag test = new DiceBag();
		OrderDie die1 = new OrderDie("Blue", "Blue");
		test.addToken(die1);
		String expected = " Dice left: 1\nBlue\n"; //In dicebag got rid of new lines
		Assert.assertEquals(expected, test.toString());
	}
	@Test
	public void testDice() {
		DiceBag test = new DiceBag();
		OrderDie d1 = new OrderDie("desc", "blue");
		OrderDie d2 = new OrderDie("desc", "blue");
		OrderDie d3 = new OrderDie("desc", "blue");
		OrderDie d4 = new OrderDie("desc", "red");
		OrderDie d5 = new OrderDie("desc", "red");
		
		test.addToken(d1);
		test.addToken(d2);
		test.addToken(d3);
		test.addToken(d4);
		test.addToken(d5);
		int expected = 5;
		int actual = test.totalToken();
		assertEquals(expected, actual);
		
		
	}



}
