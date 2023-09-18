package PrimeirasAtividades;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua idade expressada em anos, meses e dias.");
        System.out.println("Anos: ");
        int anos = entrada.nextInt();
        System.out.println("meses: ");
        int mes = entrada.nextInt();
        System.out.println("dias: ");
        int dias = entrada.nextInt();

        int somaAnos = anos * 365;
        int somaMeses = mes * 30;
        int somaTotal = somaAnos + somaMeses + dias;
        System.out.println("\nVocê tem: " + anos + " anos, " + mes + " meses e " + dias + " dias");
        System.out.println("\nTotalizando: " + somaTotal + " dias.");

        entrada.close();
    }

}
