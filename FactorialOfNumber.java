
import java.util.Scanner;

public class FactorialOfNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number: ");
        int num = sc.nextInt();
        int fact = factorialOfNumber(num);
        System.out.println("Factorial of a number is: " + fact);
    }
    public static int factorialOfNumber(int num)
    {
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }
    

}
