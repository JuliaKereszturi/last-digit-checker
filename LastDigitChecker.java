package ch1;

public class LastDigitChecker {

	public static void main(String[] args) {

		hasSameLastDigit(20,20,30);
		System.out.println(hasSameLastDigit(20,20,30));
		
	}
	public static boolean hasSameLastDigit(int num1, int num2, int num3)
	{
		int temp1;
	    int temp2;
	    int temp3;
	    
		if(num1>=10 && num1<= 1000 && num2>=10 && num2<= 1000 && num3>=10 && num3<= 1000)	
		{
		   temp1 = num1 % 10;
		   temp2 = num2 % 10;
		   temp3 = num3 % 10;
		   do {
			   if(temp1 == temp2 || temp2 == temp3 || temp3 == temp1)
				   return true;
			   else 
				   return false;
			   
		   } while(num1 != 0 && num2 != 0 && num3 != 0);
		}
		return false;
		
	}

	public static boolean isValid(int firstNumber)
	{
		if(firstNumber >= 10 && firstNumber <= 1000)
			return true;
		else
			return false;
		
	}
}
