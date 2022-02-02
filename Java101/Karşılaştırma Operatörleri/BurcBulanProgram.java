import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();

        if (month == 1) {
            if (day <= 21) {
                System.out.print("Oğlak Burcu");
            } else {
                System.out.print("Kova Burcu");
            }
        }
        if (month == 2) {
            if (day <= 19) {
                System.out.print("Kova Burcu");
            } else {
                System.out.print("Balık Burcu");
            }
        }
        if (month == 3) {
            if (day <= 20) {
                System.out.print("Balık Burcu");
            } else {
                System.out.print("Koç Burcu");
            }
        }
        if (month == 4) {
            if (day <= 20) {
                System.out.print("Koç Burcu");
            } else {
                System.out.print("Boğa Burcu");
            }
        }
        if (month == 5) {
            if (day <= 21) {
                System.out.print("Boğa Burcu");
            } else {
                System.out.print("İkiz Burcu");
            }
        }
        if (month == 6) {
            if (day <= 22) {
                System.out.print("İkiz Burcu");
            } else {
                System.out.print("Yengeç Burcu");
            }
        }
        if (month == 7) {
            if (day <= 22) {
                System.out.print("Yengeç Burcu");
            } else {
                System.out.print("Aslan Burcu");
            }
        }
        if (month == 8) {
            if (day <= 22) {
                System.out.print("Aslan Burcu");
            } else {
                System.out.print("Başak Burcu");
            }
        }
        if (month == 9) {
            if (day <= 22) {
                System.out.print("Başak Burcu");
            } else {
                System.out.print("Terazi Burcu");
            }
        }
        if (month == 10) {
            if (day <= 22) {
                System.out.print("Terazi Burcu");
            } else {
                System.out.print("Akrep Burcu");
            }
        }
        if (month == 11) {
            if (day <= 21) {
                System.out.print("Akrep Burcu");
            } else {
                System.out.print("Oğlak Burcu");
            }
        }
        if (month == 12) {
            if (day <= 21) {
                System.out.print("Yay Burcu");
            } else {
                System.out.print("Oğlak Burcu");
            }
        }
    }
}