public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 100, 100, 35);
        Fighter f2 = new Fighter("B", 15, 80, 100, 45);

        Match match = new Match(f1, f2, 100, 120);
        match.run();
    }
}
