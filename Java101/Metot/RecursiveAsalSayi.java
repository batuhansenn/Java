import java.util.Scanner;

public class RecursiveAsalSayi {

    static boolean asalMi(int sayi, int bolen) {
        if (sayi == 2) {
            return true;
        } else if (sayi <= bolen - 1) {
            if (sayi % bolen == 0) {
                return true;
            }

            else {
                asalMi(sayi, bolen + 1);
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        sayi = scanner.nextInt();
        if (asalMi(sayi, 2)) {
            System.out.print(sayi + " Sayısı asal değildir");
        } else {
            System.out.print(sayi + " Sayısı Asaldir");
        }
    }
}
