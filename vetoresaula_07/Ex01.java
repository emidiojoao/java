//1) Crie um algoritmo que peça ao usuário que informe oito números inteiros e os armazene-os em um 
//vetor. Apresente o maior elemento e a posição em que ele se encontra no vetor.
package vetoresaula_07;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorNumeros = new int[8];
        int maiorValor = Integer.MIN_VALUE;
        int posicaoMaiorValor = 0;

        for (int contador = 0; contador < vetorNumeros.length; contador++) {
            System.out.printf("Informe o %sº valor: ", contador + 1);
            vetorNumeros[contador] = entrada.nextInt();

            if (vetorNumeros[contador] > maiorValor) {
                maiorValor = vetorNumeros[contador];
                posicaoMaiorValor = contador;
            }
        }
        System.out.printf("Maior elemento: %s e Posição: %s ", maiorValor, posicaoMaiorValor);
        entrada.close();
    }

}
