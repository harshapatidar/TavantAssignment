package Day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void test() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(99);
		String expected="Grade A";
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(80);
		String expected="Grade B";
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(68);
		String expected="Grade C";
		assertEquals(expected, actual);
	}
	@Test
	void test4() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(30);
		String expected="false";
		assertEquals(expected, actual);
	}

}
