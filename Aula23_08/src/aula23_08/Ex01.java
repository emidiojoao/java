package aula23_08;

import java.util.Scanner;

public class Ex01 {

    /* 
    Desenvolva um algoritmo que receba o valor da base e da altura de um triângulo e mostre sua área
    A área do triangulo retângulo é calculada por meio da formula area ==(base * altura) 2
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da base do triângulo: ");
        float base = entrada.nextFloat();

        System.out.println("Informe o valor da altura do triângulo");
        float altura = entrada.nextFloat();

        System.out.println("A área do triângulo é: " + (base * altura) / 2);

        entrada.close();
    }
}
