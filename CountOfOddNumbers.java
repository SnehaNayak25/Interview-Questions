import java.util.Scanner;

public class CountOfOddNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        // Calls the countOfOddNumbers method and stores the result in oddCount
        int oddCount = countOfOddNumbers(num);
        // Checks if there are any odd digits in the number
        if(oddCount!=0)
        { 
            System.out.println("Total count of odd numbers: " + oddCount);
        }
        else
        {
            System.out.println("No odd numbers present");
        }
                
    }
    //  Static method to calculate the count of odd digits in a number.
    public  static int countOfOddNumbers(int num) 
    {
        // Initializes the variable oddCount to store the count of odd digits
        int oddCount = 0;
        // Starts a loop that runs until num becomes 0
        while(num > 0) 
        {
            // Extracts the last digit of num using modulo operation
            int rem = num%10;
            // Checks if the extracted digit is even
            if(rem%2!=0)
            {
                oddCount ++;
            }
            num/=10;
        }
        return oddCount;
    }
    

}
