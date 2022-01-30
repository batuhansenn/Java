import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double ArmutPrice = 2.14, ElmaPrice = 3.67, DomatesPrice = 1.11, MuzPrice = 0.95, PatlicanPrice = 5.00;
        double ArmutKg, ElmaKg, DomatesKg, MuzKg, PatlicanKg;
        double ArmutTop, ElmaTop, DomatesTop, MuzTop, PatlicanTop;
        double toplamFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç kilo : ");
        ArmutKg = input.nextDouble();
        ArmutTop = ArmutKg * ArmutPrice;

        System.out.print("Elma Kaç kilo : ");
        ElmaKg = input.nextDouble();
        ElmaTop = ElmaKg * ElmaPrice;

        System.out.print("Domates Kaç kilo : ");
        DomatesKg = input.nextDouble();
        DomatesTop = DomatesKg * DomatesPrice;

        System.out.print("Muz Kaç kilo : ");
        MuzKg = input.nextDouble();
        MuzTop = MuzKg * MuzPrice;

        System.out.print("Patlican Kaç kilo : ");
        PatlicanKg = input.nextDouble();
        PatlicanTop = PatlicanKg * PatlicanPrice;

        toplamFiyat = ArmutTop + ElmaTop + DomatesTop + MuzTop + PatlicanTop;
        System.out.println(toplamFiyat);
    }

}
