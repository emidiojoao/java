package atividadesswitchcase;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma das seguintes vogais: A, E, I, O, U: ");
        char vogal = entrada.next().charAt(0);

        if (vogal == 'A') {
            System.out.println("A vogal subsequente é 'E'");
        } else if (vogal == 'E') {
            System.out.println("A vogal subsequente é 'I'");
        } else if (vogal == 'I') {
            System.out.println("A vogal subsequente é 'O'");
        } else if (vogal == 'O') {
            System.out.println("A vogal subsequente é 'U'");
        } else if (vogal == 'U') {
            System.out.println("A vogal subsequente é 'A'");
        } else {

            entrada.close();
        }
    }
