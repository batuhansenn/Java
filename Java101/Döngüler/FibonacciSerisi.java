import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını yazınız : ");
        int count = input.nextInt();

        System.out.print("Fibonacci Serisi " + count + " sayı : ");
        int i = 1;

        while (i <= count) {
            System.out.print(num1 + " ");
            int top = num1 + num2;
            num1 = num2;
            num2 = top;
            i++;
        }
    }
}
