import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int n, r, sonuc;
        int faktoriyelj = 1, faktoriyeln = 1, faktoriyelr = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("'n' Değerini giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            faktoriyeln *= i;
        }

        System.out.print("'r' Değerini giriniz : ");
        r = input.nextInt();

        for (int k = 1; k <= r; k++) {
            faktoriyelr *= k;
        }

        for (int j = 1; j <= r; j++) {
            faktoriyelr *= j;
        }

        sonuc = (faktoriyeln) / (faktoriyelr * faktoriyelj);
        System.out.println("C(" + (n) + "," + (r) + ")" + ":" + sonuc);
    }
}
