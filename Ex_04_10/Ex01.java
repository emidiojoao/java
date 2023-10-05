package aula04_10;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        float num1 = entrada.nextInt();
        System.out.println("Informe mais um número inteiro: ");
        float num2 = entrada.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Error! Não existe divisão/multiplicação por esse número.");
        } else {
            System.out.println("Soma: " + num1 + " e " + num2 + " = " + (num1 + num2));
            System.out.println("Subtração: " + num1 + " e " + num2 + " = " + (num1 - num2));
            System.out.println("Divisão: " + num1 + " e " + num2 + " = " + (num1 / num2) + " Resto da divisão: " + (num1 % num2));
            System.out.println("Multiplicação: " + num1 + " e " + num2 + " = " + num1 * num2);
        }

        entrada.close();
    }

}
