// 2) Crie um algoritmo que peça ao usuário que informe 10 números inteiros, armazene-os em um vetor 
// e apresente a soma de todos os valores. Exemplo:
package vetoresaula_07;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorNumeros = new int[10];
        int soma = 0;

        for (int contador = 0; contador < vetorNumeros.length; contador++) {
            System.out.printf("Informe o %sº valor: ", contador + 1);
            vetorNumeros[contador] = entrada.nextInt();

            soma = soma + vetorNumeros[contador];
        }
        System.out.println("A soma de todos os valores é de: " + soma);

        entrada.close();
    }

}
