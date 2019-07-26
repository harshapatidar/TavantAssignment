package Day3;

public class Factorial {

	static int factorial(int number) {
		if(number==0)
			return 1;		
		return number*factorial(number-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(10));
	}

}
