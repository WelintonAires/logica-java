package estruturarepeticao.enquanto;

import java.util.Scanner;

public class SintaxeEnquanto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        int auxiliar = 0;
        while ( numero != 0){
            auxiliar = auxiliar + numero;
            numero = scanner.nextInt();

        }
        scanner.close();
    }

}
