import java.util.Scanner;
import java.util.regex.*;

public class PinCodeValidation 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to PIN Code Validation Program");

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the PIN Code: ");
		String pincode = scan.nextLine();
		
		Pattern pattern = Pattern.compile("^[0-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$|^[0-9]{1}[0-9]{4}[0-9]{1}$");
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
