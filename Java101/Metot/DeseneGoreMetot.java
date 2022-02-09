import java.util.Scanner;

public class DeseneGoreMetot {

    static int m(int x, int degisen, int stste) {

        System.out.println(+degisen + " ");

        if (degisen <= 0 || stste == 1) {
            while (x != degisen) {
                return m(x, degisen + 5, 1);
            }
            System.exit(0);
        }
        return m(x, degisen - 5, 0);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        System.out.println(m(number, number, 0));
    }
}
