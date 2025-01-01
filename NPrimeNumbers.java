
import java.util.Scanner;

public class NPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        nPrimeNumbers(num);

    }

    public static void nPrimeNumbers(int num) {
        System.out.println("The Prime numbers upto " + num + " are: ");
        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
