package Day3;

public class SumOfNumbers {

	int sumOfEvenNumbers(int start, int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	int sumOfOddNumbers(int start, int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SumOfNumbers sumofnumbers=new SumOfNumbers();
			System.out.println(sumofnumbers.sumOfEvenNumbers(1,10));
			System.out.println(sumofnumbers.sumOfOddNumbers(1,10));
	}

}
