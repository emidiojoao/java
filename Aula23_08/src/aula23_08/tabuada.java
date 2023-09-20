package atividades;

import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("Erro! Não existe a tabuada do número zero.");
        } else {

            for (int contador = 1; contador <= 10; contador++) {

                System.out.println(numero + " x " + contador + " = " + (numero * contador));
            }

            entrada.close();
        }
    }
}
