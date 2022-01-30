import java.util.Scanner;

public class VücutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, kitleEndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        kitleEndex = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + kitleEndex);

    }
}
