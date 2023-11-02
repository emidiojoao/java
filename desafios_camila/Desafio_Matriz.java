
package desafios_camila;

import java.util.Scanner;

public class Desafio_Matriz {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[][] matrizNumero = new int[2][2];
        
        for (int i = 0; i < matrizNumero.length; i++) {
            
            for (int j = 0; j < matrizNumero[i].length; j++) {
                System.out.printf("Informe o numero (%s, %s): ", i,j);
                matrizNumero[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < matrizNumero.length; i++) {
            for (int j = 0; j < matrizNumero[i].length; j++) {
                System.out.print(matrizNumero[i][j]+ " ");
            }
            System.out.println();
        }
        entrada.close();
    }
}
