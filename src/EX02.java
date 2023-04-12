import java.util.Locale;
import java.util.Scanner;

public class EX02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double R, A, pi = 3.14159;

        R = scanner.nextDouble();
        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        scanner.close();
    }
}
