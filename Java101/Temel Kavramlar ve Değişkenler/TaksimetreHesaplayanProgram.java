import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {

        int Km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        Km = input.nextInt();

        total = (Km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar : " + total + " TL");
    }

}
