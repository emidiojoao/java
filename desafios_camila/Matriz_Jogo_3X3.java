package desafios_camila;

import java.util.Scanner;

public class Matriz_Jogo_3X3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char[][] matrizJogo = new char[3][3];

        for (int i = 0; i < matrizJogo.length; i++) {
            for (int j = 0; j < matrizJogo[i].length; j++) {

                System.out.println("Informe (X) ou (O): ");
                matrizJogo[i][j] = entrada.next().charAt(0);
            }
        }
        for (int i = 0; i < matrizJogo.length; i++) {
            for (int j = 0; j < matrizJogo[i].length; j++) {

                System.out.print(matrizJogo[i][j] + " ");
            }
            System.out.println();
        }
        entrada.close();
    }
}
