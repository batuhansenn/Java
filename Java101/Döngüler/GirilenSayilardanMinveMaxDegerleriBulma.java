import java.util.Scanner;

public class GirilenSayilardanMinveMaxDegerleriBulma {
    public static void main(String[] args) {
        int number, elemanSayisi, minNumber = 0, maxNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        elemanSayisi = input.nextInt();

        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(i + ". Sayıyı giriniz : ");
            number = input.nextInt();

            if (i == 1) {
                minNumber = number;
                maxNumber = number;
            } else {
                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }
            }
        }
        System.out.println("En Buyuk Sayı : " + maxNumber);
        System.out.println("En Küçükk Sayı : " + minNumber);
    }
}
