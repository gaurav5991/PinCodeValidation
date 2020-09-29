import java.util.Scanner;
import java.util.regex.*;

public class PinCodeValidation 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to PIN Code Validation Program");

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the PIN Code: ");
		String pincode = scan.next();
		
		Pattern pattern = Pattern.compile("^[0-9][0-9]{5}$");
		Matcher match = pattern.matcher(pincode);
		
		if(match.matches())
		{
			System.out.println("Valid PIN Code");
		}
		else
		{
			System.out.println("Invalid PIN Code");
		}
	}
}
