import java.util.Scanner;

public class UcVeDorteBolunenSayi {
    public static void main(String[] args) {

        int k;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi girniz : ");
        k = input.nextInt();

        int i = 0;
        double sum = 0, count = 0;
        while (i <= k) {
            i++;
            if (i % 3 == 0 && i % 4 == 0) {

                sum = sum + i;

                count++;
            }
        }
        ortalama = sum / count;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + ortalama);
    }
}
