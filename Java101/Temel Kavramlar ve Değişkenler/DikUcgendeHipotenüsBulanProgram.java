import java.util.Scanner;

public interface DikUcgendeHipotenüsBulanProgram {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. kenarı giriniz : ");
        a = input.nextInt();

        System.out.print("2. kenarı griniz : ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.print("hipotenüs : " + c);

    }
}
