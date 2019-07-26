package Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempratureTest {

	@Test
	void testF() {
		Temprature temprature=new Temprature();
		double actual=temprature.convertToFarenheit(10.0);
		double expected=50.0;
		assertEquals(expected, actual);
	}
	@Test
	void testC() {
		Temprature temprature=new Temprature();
		double actual=temprature.convertToCelsius(104.0);
		double expected=40.0;
		assertEquals(expected, actual);
	}

}