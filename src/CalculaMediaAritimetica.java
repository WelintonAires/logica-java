/*
Suponha um programa que solicita ao usuario dois numeros e depois mostra a media aritimetica deles:

       Ex:
            *** ENTRADA DE DADOS ***
            Digite o primeiro numero: 3
            Digite o segundo numero: 6

           *** PROCESSAMENTO ***
           MEDIA = (3 + 6) / 2

           *** SAIDA DE DADOS ***
           Media aritimetica: 4,5


 */


import java.util.Scanner;

public class CalculaMediaAritimetica {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        System.out.println("Digite o primeiro valor");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo valor");
        double segundoNumero = scanner.nextDouble();

        // *** PROCESSANDO ***
        double resultado = (primeiroNumero + segundoNumero) / 2;

         //*** SAIDA DE DADOS ***
        System.out.println("O resuntado e" + resultado);


    }
}
