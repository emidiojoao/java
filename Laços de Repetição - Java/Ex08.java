// 8. Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles. Mostre o resultado.
package ex_04_10;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorNumero = -99999;
        int menorNumero = 99999;
        for (int i = 1; i <= 50; i++) {
            System.out.println("informe o " + i + "º número: ");
            int numero = entrada.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        System.out.println("O menor número informado foi: " + menorNumero);
        System.out.println("O maior número informado foi: " + maiorNumero);
    }
}
