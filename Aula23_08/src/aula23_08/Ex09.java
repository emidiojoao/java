
package PrimeirasAtividades;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a pontuação do líder do campeonato brasileiro de futebol: ");
        int pontuacao = entrada.nextInt();
        System.out.println("Informe a quantidade de pontos do time lanterna: ");
        int lanterna = entrada.nextInt();
        
        int pontos = (pontuacao - lanterna) / 3;
        System.out.println("Para ultrapassar o primeiro colocado, o time lanterna deverá fazer: " + pontos + " vitórias.");
    }
}
