package ex01;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor para o limite: ");
        int numero = entrada.nextInt();

        int contador = 1;
        while (contador <= numero) {
            System.out.printf("Número: %s, Dobro: %s, Triplo: %s \n", numero, numero * numero, numero * numero * numero);
            numero--;
        }
    }

}
