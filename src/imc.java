
import java.util.Locale;
import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

           System.out.println("Digite seu peso");
           double peso = scanner.nextDouble();

           System.out.println("Digite sua altura");
           double altura = scanner.nextDouble();

           double resultado = (peso) / (altura * altura);

           System.out.println("O resuntado e %.2f%n" + resultado);

    }
}