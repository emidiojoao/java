/* 5. Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3
centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários
para que Zé seja maior que Chico.
 */
package ex_04_10;

public class Ex05 {

    public static void main(String[] args) {

        float medidaChico = 1.50f;
        float medidaZe = 1.10f;
        float centimetroChico = 0.02f;
        float centimetroZe = 0.03f;
        int contador = 0;

        while (medidaChico > medidaZe) {
            medidaChico = medidaChico + centimetroChico;
            medidaZe = medidaZe + centimetroZe;
            contador++;
        }
        System.out.println("\nSerão necessários: " + contador + " anos, para Zé ultrapassar Chico");
        System.out.println("A medida final de Zé será de: " + medidaZe + " metros");
        System.out.println("A medidade final de Chico será de " + medidaChico + " metros");

    }
}
