import java.util.Scanner;

public class IkininKuvvetleriniBulan {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi girniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4'in katlari : " + i);
        }

        for (int i = 1; i <= n; i *= 5) {
            System.out.println("5'in katlari : " + i);
        }
    }
}
