import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String name = scan.next();
        System.out.print("Podaj nazwisko: ");
        String lastName = scan.next();
        System.out.print("Podaj wiek: ");
        int age = scan.nextInt();
        System.out.print("Podaj nr indeksu: ");
        int index = scan.nextInt();

        System.out.printf("Imię i nazwisko: %s %s\n", name, lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Nr indeksu: " + index);

        int first = scan.nextInt();
        int second = scan.nextInt();

        System.out.printf("%d + %d = %d\n", first, second, first + second);
        System.out.printf("%d - %d = %d\n", first, second, first - second);
        System.out.printf("%d * %d = %d\n", first, second, first * second);
        System.out.printf("%d / %d = %d\n", first, second, first / second);
        System.out.printf("%d mod %d = %d\n", first, second, first % second);
    }
}
