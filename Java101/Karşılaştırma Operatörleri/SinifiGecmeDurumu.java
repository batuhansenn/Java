import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyoloji, geo;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        int ders1 = (mat <= 100 && mat >= 0) ? mat : 0;

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        int ders2 = (fizik <= 100 && fizik >= 0) ? fizik : 0;

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        int ders3 = (kimya <= 100 && kimya >= 0) ? kimya : 0;

        System.out.print("Biyoloji notunuz : ");
        biyoloji = input.nextInt();
        int ders4 = (biyoloji <= 100 && biyoloji >= 0) ? biyoloji : 0;

        System.out.print("Geometri notunuz : ");
        geo = input.nextInt();
        int ders5 = (geo <= 100 && geo >= 0) ? geo : 0;

        double avagre = (ders1 + ders2 + ders3 + ders4 + ders5) / 5;

        if (avagre <= 55) {
            System.out.println("Sınıfta kaldınız seneye görüşmek üzere :(");
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz");
        }

        System.out.println("Ortalanız : " + avagre);
    }

}
