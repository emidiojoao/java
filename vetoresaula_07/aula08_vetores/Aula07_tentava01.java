package aula08_vetores;

import java.util.Scanner;

public class Aula07_tentava01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Definição do tamanho do vetor de alunos.
        System.out.println("Informe a quantidade de alunos: ");
        int qntAlunos = entrada.nextInt();

        String[] vetorNomes = new String[qntAlunos];
        double[] vetorNotas = new double[vetorNomes.length * 3];
        double[] vetorMedia = new double[vetorNomes.length];
        int contadorNota = 0;
        double soma = 0;

        for (int i = 0; i < vetorNomes.length; i++) {

            System.out.printf("Informe o nome do %sº aluno:", i + 1);
            vetorNomes[i] = entrada.next();

            for (int j = 0; j < 3; j++) {

                System.out.printf("Informe a %s:  nota: ", j + 1);
                vetorNotas[j] = entrada.nextInt();

                soma = soma + vetorNotas[j];
                vetorMedia[j]= soma;
                contadorNota++;
            }
            
                for (int k = 0; k < 10; k++) {

                }
            }
        }

    }
}
