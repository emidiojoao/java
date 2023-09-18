package aula23_08;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor númerico: ");
        float n1 = entrada.nextFloat();

        System.out.println("Informe mais um valor númerico: ");
        float n2 = entrada.nextFloat();

        System.out.println("A soma desses dois números é: " + (n1 + n2));
        System.out.println("A subtração desses dois números é: " + (n1 - n2));
        System.out.println("A divisão desses dois números é: " + (n1 / n2));
        System.out.println("A multiplicação desses dois números é: " + (n1 * n2));

        entrada.close();
    }

}
