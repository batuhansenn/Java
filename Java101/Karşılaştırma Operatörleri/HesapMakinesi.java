import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayısyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Sonuç : " + n1 + n2);
                break;
            case 2:
                System.out.print("Sonuç : " + n1 + n2);
                break;
            case 3:
                System.out.print("Sonuç : " + n1 * n2);
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("A sayısı 0'a bölünemez");
                        break;
                    default:
                        select = n1 / n2;
                        System.out.println("Sonuç : " + select);
                        break;
                }
                break;
            default:
                System.out.println("Giriş Hatası");
                break;
        }
    }

}
