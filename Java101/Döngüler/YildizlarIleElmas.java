import java.util.Scanner;

public class YildizlarIleElmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int m = n; m >= 1; m--) {
            for (int j = 1; j <= (n - m); j++) {
                System.out.print(" ");
            }
            for (int k = (2 * m) - 1; k >= 1; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}