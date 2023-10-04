package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o " + i + "º número: ");
            int numero = entrada.nextInt();
            soma = numero + i;
        }
        System.out.println("A soma de todos os números é: " + soma);
        entrada.close();
    }

}
