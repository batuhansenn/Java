import java.util.Scanner;

import javax.swing.text.Style;

public class FlightTicketPriceCalculation {
    public static void main(String[] args) {

        int age, km, typeOfFlight;
        double discountRateForTypeOfFlight = 1, discountRateForAge = 1, totalPrice = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        typeOfFlight = input.nextInt();

        if ((km > 0 && age > 0) && (typeOfFlight == 1 || typeOfFlight == 2)) {
            if (age < 12) {
                discountRateForAge = 0.5;
            } else if (age > 12) {
                discountRateForAge = 0.9;
            } else if (age > 65) {
                discountRateForAge = 0.8;
            } else {
                discountRateForAge = 1;
            }
            if (typeOfFlight == 2) {
                discountRateForTypeOfFlight = 0.8;
                totalPrice = (0.1 * km * discountRateForAge * discountRateForTypeOfFlight) * 2;
            } else {
                discountRateForTypeOfFlight = 1;
                totalPrice = 0.1 * km * discountRateForAge * discountRateForTypeOfFlight;
            }
        } else {
            System.out.println("Hatali veri girdiniz !");
        }

        System.out.println("Toplam Tutar = " + totalPrice + " TL");
    }
}
