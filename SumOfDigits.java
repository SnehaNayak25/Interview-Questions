import java.util.Scanner;

public class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int digitSum = sumOfDigits(num);
        System.out.println("Sum of Digits is: " + digitSum);
    }
    public static int sumOfDigits(int num) 
    {
        int digitSum = 0;
        while(num > 0)
        {
            int rem = num % 10;
            digitSum += rem;
            num /= 10;
        }
        return digitSum;
    }
}
