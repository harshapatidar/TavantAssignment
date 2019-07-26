package Day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial factorial= new Factorial();
		int expected=factorial.factorial(5);
		int actual=120;
		assertEquals(expected, actual);
	}
	
}
