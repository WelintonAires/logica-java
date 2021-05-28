import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora");
        int horaAtual = scanner.nextInt();

        if(horaAtual < 12) {
            System.out.println("Bom Dia");
        }else if(horaAtual >= 12 && horaAtual < 18){
            System.out.println("Boa Tarde");
        }else{
            System.out.println("Boa Noite");
        }
    }
}
