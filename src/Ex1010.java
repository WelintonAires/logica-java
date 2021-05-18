import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int cod1 = scanner.nextInt();
    int peca1 = scanner.nextInt();
    double valor1 = scanner.nextDouble();
    int cod2 = scanner.nextInt();
    int peca2 = scanner.nextInt();
    double valor2 = scanner.nextDouble();

    double valorTotal = peca1 * valor1 + peca2 * valor2;


   System.out.printf("VALOR A PAGAR: R$" + "%.2f", valorTotal);

   scanner.close();

}
}
