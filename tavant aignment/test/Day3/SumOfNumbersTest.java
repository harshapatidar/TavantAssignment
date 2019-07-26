package Day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfEvenNumbers(1,10);
		int expected=30;
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfOddNumbers(1,10);
		int expected=25;
		assertEquals(expected, actual);
	}

}
