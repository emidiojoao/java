package ex01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = entrada.nextInt();

        int contador = 1;
        while (contador <= 10) {
            if (numero <= 0) {
                System.out.println("Error! Não existe multiplicação por zero ou números negativos.");
                break;
            }
            System.out.println(numero + " x " + contador + " = " + numero * contador);
            contador++;

        }
        entrada.close();
    }
}
