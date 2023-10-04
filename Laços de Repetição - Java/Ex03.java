package ex01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = entrada.nextInt();

        int contador = 1;
        while (contador <= 10) {

            if (numero <= 0) {
                System.out.println("Error! Não existe divisão desse número.");
                break;
            }
            System.out.println(numero * contador + " / " + numero + " = " + contador);
            contador++;
        }
        entrada.close();
    }

}
