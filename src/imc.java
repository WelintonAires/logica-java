
import java.util.Locale;
import java.util.Scanner;

public class imc {

    public static void main(String[] args) {

           Locale.setDefault(Locale.US);

           Scanner scanner = new Scanner(System.in);
           System.out.println("Digite o seu nome");
           String nome = scanner.nextLine();

           System.out.println("Digite seu peso");
           double peso = scanner.nextDouble();

           System.out.println("Digite sua altura");
           double altura = scanner.nextDouble();

           double resultado = (peso) / (altura * altura);

           //System.out.printf("o resultado é %.2f%n", resultado);//

           System.out.printf("O meu nome é %s e tenho %.2f Kg, minha altura é %.2f e meu imc é", nome, peso, altura, resultado);

           scanner.close();

    }
}