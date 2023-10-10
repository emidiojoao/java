/* 9. Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:

a) a quantidade de pessoas com idade superior a 50 anos;
b) a média das alturas das pessoas com idade entre 10 e 20 anos;
c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
 */
package ex_04_10;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadorIdade = 0;
        float contadorAltura = 0;
        int contador10_20 = 0;
        int contadorPeso = 0;
        int contador = 1;

        while (contador <=3) {
            System.out.println("Informe a idade da " + contador + " pessoa: ");
            int idade = entrada.nextInt();;
            System.out.println("Informe a altura da " + contador + " pessoa: ");
            float altura = entrada.nextFloat();
            System.out.println("Informe o peso da " + contador + " pessoa: ");
            float peso = entrada.nextFloat();

            if (idade > 50) {
                contadorIdade++;
            }
            if (idade >= 10 || idade <= 20) {
                contadorAltura = contadorAltura + altura;
                contador10_20++;
            }
            if (peso < 40) {
                contadorPeso++;
            }
            contador++;
        }
        System.out.println("Foi informado " + contadorIdade + " pessoas acima de 50 anos.");
        System.out.println("A média de altura entre 10 e 20 anos é de: " + (contadorAltura / contador10_20) + "%");
        System.out.println("A porcentagem de pessoa inferior a 40 quilos foi de: " + (contadorPeso / contador));
    }
}
