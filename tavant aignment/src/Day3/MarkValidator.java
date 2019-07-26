package Day3;

public class MarkValidator {

	boolean  isPass(int mark)
	{
		if(mark>=40)
			return true;
		else
			return false;
	}
	
	String markGrade(int mark)
	{
		if(isPass(mark))
		{
			if(mark>90)
				return "Grade A";
			else if(mark>75)
				return "Grade B";
			else if(mark>60)
				return "Grade C";
			else
				return "Grade D";
		}
		else
			return "false";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarkValidator markvalidator= new MarkValidator();
		System.out.println(markvalidator.markGrade(75));
	}

}
