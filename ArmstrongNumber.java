// Imports the Scanner class for taking user input.
import java.util.Scanner;
// Defines a public class named ArmstrongNumber
public class ArmstrongNumber
{
	// The main method where the program execution starts. 
	public static void main(String[] args) 
	{
		// Creating Object for scanner class to take user input
		Scanner sc=new Scanner(System.in);
		// Prompts the user to enter a number.
		System.out.println("Enter a number: ");
		// Reads an integer input from the user and stores it in num
		int num=sc.nextInt();
		// Calls the ExtractDigit method to calculate the Armstrong sum of num
		int result=ExtractDigit(num);
		// Checks if the calculated sum (result) is equal to the original number (num)
		if(result==num)
		{
			//  Prints that the number is an Armstrong number if the condition is true
			System.out.println("Armstrong number");
		}
		else
		{
			//  Prints that the number is not an Armstrong number if the condition is false
			System.out.println("Not armstrong number");
		}
	}
	
	// Method to count the number of digits in the given number
	public static int digitCount(int num)
	{
		// Initializes a counter variable to count digits
		int count=0;
		// Loops as long as the number is greater than 0
		while(num>0)
		{
			 // Removes the last digit from the number by integer division
			 num=num/10;
			 // Increments the digit counter
			 count ++;	
		}
		// Returns the total number of digits
		return count;
	}
	
	// Method to calculate the sum of each digit raised to the power of the total digit count
	public static int ExtractDigit(int num)
	{
		// Calls digitCount to get the total number of digits
		int count=digitCount(num);
		// Initializes a variable to store the sum of powered digits
		int sum=0;
		// Loops as long as the number is greater than 0
		while(num>0)
		{
			// Extracts the last digit using the modulo operator
			int rem=num%10;
			// Adds the power of the extracted digit to the sum
			sum += findPower(rem,count);
			// Removes the last digit by integer division
			num/=10;
		}
		// Returns the calculated sum
		return sum;
	}
	
	// Method to calculate the power of a number 
	public static int findPower(int num,int power)
	{
		//  Initializes a variable to store the result of the power operation 
		int result=1;
		// Loops for the given power value
		for(int i=1;i<=power;i++)
		{
			// Multiplies the number with itself repeatedly to compute the power
			result*=num;
		}
		// Returns the calculated power
		return result ;
	}
}
