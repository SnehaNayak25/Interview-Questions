import java.util.Scanner;

public class CountOfEvenNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int evenCount = countOfEvenNumbers(num);
        if(evenCount!=0)
        { 
            System.out.println("Total count of even numbers: " + evenCount);
        }
        else
        {
            System.out.println("No even numbers present");
        }
                
    }
    public  static int countOfEvenNumbers(int num) 
    {
        int evenCount = 0;
        while(num > 0) 
        {
            int rem = num%10;
            if(rem%2==0)
            {
                evenCount ++;
            }
            num/=10;
        }
        return evenCount;
    }
    

}
