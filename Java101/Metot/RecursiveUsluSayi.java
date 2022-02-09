import java.util.Scanner;

public class RecursiveUsluSayi {

    static int power(int n1, int n2) {
        if (n2 == 0) {
            return 1;
        } else {
            int result = n1 * power(n1, n2 - 1);
            return result;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("1. sayıyı giriniz : ");
            int s1 = input.nextInt();

            System.out.print("2. sayıyı giriniz : ");
            int s2 = input.nextInt();

            power(s1, s2);
            System.out.println(power(s1, s2));
        }
    }
}
