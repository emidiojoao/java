
package aula10_matrizes;

import java.util.Random;

public class Exemplo2 {
    public static void main(String[] args) {
        
        int[][] matriz = new int [3][3];
        Random numerosAleatorios = new Random();
        
        for (int linha = 0; linha < matriz.length; linha++) {
            
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                
                System.out.println("");
                matriz[linha][coluna] = numerosAleatorios.nextInt(10);
                
            }
            
        }
        System.out.println("Matriz:");
        for (int linha = 0; linha < matriz.length; linha++) {
            
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
