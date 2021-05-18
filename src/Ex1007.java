import java.util.Scanner;
import java.util.Locale;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int DIFERENCA = (A*B-C*D);

        System.out.println("DIFERENCA = " + DIFERENCA);
        scanner.close();
    }
}
