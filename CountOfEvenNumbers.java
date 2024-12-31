import java.util.Scanner;

public class CountOfEvenNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        // Calls the countOfEvenNumbers method and stores the result in evenCount
        int evenCount = countOfEvenNumbers(num);
        // Checks if there are any even digits in the number 
        if(evenCount!=0)
        { 
            System.out.println("Total count of even numbers: " + evenCount);
        }
        else
        {
            System.out.println("No even numbers present");
        }
                
    }
    //  Static method to calculate the count of even digits in a number.
    public  static int countOfEvenNumbers(int num) 
    {
        // Initializes the variable evenCount to store the count of even digits
        int evenCount = 0;
        // Starts a loop that runs until num becomes 0
        while(num > 0) 
        {
            // Extracts the last digit of num using modulo operation
            int rem = num%10;
            // Checks if the extracted digit is even
            if(rem%2==0)
            {
                evenCount ++;
            }
            // Removes the last digit from num by dividing it by 10
            num/=10;
        }
        // Returns the total count of even digits
        return evenCount;
    }
    

}
