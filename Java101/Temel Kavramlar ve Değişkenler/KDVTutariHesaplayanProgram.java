import java.text.DecimalFormat;
import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar;
        double KDV = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz : ");
        tutar = input.nextDouble();
        if (tutar > 1000) {
            KDV = 0.08;
        }

        System.out.println("Girilen tutar : " + tutar);
        tutar += tutar * KDV;
        System.out.println("KDV oranı : " + KDV);
        System.out.println("KDV'li tutar : " + new DecimalFormat("#.#").format(tutar));
    }
}