package aula23_08;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, Seja Bem-vindo!");
        System.out.println("O saldo atual da sua conta é R$: 0,00 ");
        System.out.println("Informe o valor que deseja depositar: ");
        float valor1 = entrada.nextFloat();

        System.out.println("Seu saldo atual é: R$ " + valor1);

        System.out.println("Informe o valor que deseja retirar: ");
        float valor2 = entrada.nextFloat();
        System.out.println("O saldo atual da sua conta é: R$ " + (valor1 - valor2));

        entrada.close();
    }
}
