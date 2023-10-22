/* Crie um algoritmo que peça ao usuário que informe 5 números inteiros, armazene-os em um vetor e 
mostre todos os elementos que são números primos. Observação: Um número é considerado primo se 
ele é divisível por 1 e por ele mesmo (O número 1 não é um número primo, pois ele tem apenas um 
divisor). */
package vetoresaula_07;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorNumeros = new int[5];

        for (int contador = 0; contador < vetorNumeros.length; contador++) {
            System.out.printf("Informe o %s valor: ", contador + 1);
            vetorNumeros[contador] = entrada.nextInt();

            if (vetorNumeros[contador] % 2 != 0 && vetorNumeros[contador] % 3 != 0 || vetorNumeros[contador] == 2 || vetorNumeros[contador] == 3) {
                System.out.println("É primo: " + vetorNumeros[contador]);
            }
        }
        entrada.close();
    }
}
