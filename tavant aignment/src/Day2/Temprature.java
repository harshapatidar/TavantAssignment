package Day2;

import java.util.Scanner;

public class Temprature {

	double convertToFarenheit(Double celsius) {
		
		double tempf=celsius*9/5+32;
		return tempf;
	}
	
double convertToCelsius(Double fahrenheit) {
		
		double tempc=(fahrenheit-32)*5/9;		
		return tempc;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double celsius=0;
		double fahrenheit=32;
		Temprature temprature = new Temprature();
		System.out.println(temprature.convertToFarenheit(celsius));
		System.out.println(temprature.convertToCelsius(fahrenheit));
	}
	}