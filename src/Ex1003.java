import java.util.Scanner;
import java.util.Locale;

public class Ex1003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int SOMA = A+B;

        System.out.println("SOMA = "+SOMA);

        scanner.close();
    }

}
