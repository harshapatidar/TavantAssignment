package Day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchCaseTest {
	@Test
	void test() {
		MarkValidatorSwitchCase markValidatorSwitchCase= new MarkValidatorSwitchCase();
		char actual=markValidatorSwitchCase.markGrade(95);
		char expected='A';
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		MarkValidatorSwitchCase markValidatorSwitchCase= new MarkValidatorSwitchCase();
		char actual=markValidatorSwitchCase.markGrade(35);
		char expected='F';
		assertEquals(expected, actual);
	}
}
