
package aula10_matrizes;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int [][] matriz = {{1,2}, {3,4}};
        int soma = 0;
                
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                
                System.out.printf("Na posição (%s, %s) : %s \n", linha, coluna, matriz[linha][coluna]);;
                soma += matriz[linha][coluna];
                
            }
        }
        System.out.println("");
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
    
}
