/* 7. Elabore um algoritmo que leia a medida em metros de frente e fundo de um número
indeterminado de terrenos. O algoritmo deverá calcular e mostrar a área do terreno. Deverá parar
somente quando a área de um terreno for inferior a 100 metros quadrados.
 */
package ex_04_10;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Informe a medida da frente do terreno: ");
            float medidaFrente = entrada.nextFloat();
            System.out.println("Informe a medida do fundo do terreno: ");
            float medidaFundo = entrada.nextFloat();

            float areaTerreno = medidaFrente * medidaFundo;
            if (areaTerreno < 100) {
                System.out.println("Error! Área inferior a 100 metros quadrados.");
                break;
            }
            System.out.println("Área: " + areaTerreno + " m²");
        }
    }
}
