import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age % 3 == 0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }

        int index = scanner.nextInt();
        System.out.println(index % 2 == 0 ? "Parzysty" : "Nieparzysty");

        double value = scanner.nextDouble();
        if (value - ((int) value) > 0.5) {
            System.out.println("Duża wartość dziesiętna");
        } else {
            System.out.println("Niska wartość dziesiętna");
        }
    }
}
