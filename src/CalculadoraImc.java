import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Magreza");
        } else if (IMC >= 18.6 && IMC < 24.9) {
            System.out.println("Normal");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}