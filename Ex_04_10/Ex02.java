package aula04_10;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char sexo = 0;

        System.out.println("Informe o seu sexo: ");

        sexo = entrada.next().charAt(0);

        sexo = Character.toUpperCase(sexo);

        if (sexo == 'F') {
            System.out.println("Feminino");
        } else if (sexo == 'M') {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo inválido!");
        }
        entrada.close();
    }
}
