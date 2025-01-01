
import java.util.Scanner;

public class ReverseOfNumber 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number: ");
       int num = sc.nextInt();
       int reverse = reverseOfNumber(num);
       System.out.println("Reverse of a number is: " + reverse);
   }
   public static int reverseOfNumber(int num)
   {    
        int reverse = 0;
        while(num > 0)
        {
            int rem = num % 10;
            reverse =  rem+reverse * 10;
            num /= 10; 
        }

        return reverse;
   }
}
