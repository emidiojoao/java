package aula06_LacosDeRepeticao;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua senha: ");
        String senha = entrada.next();
        
        System.out.println("Confirme a sua senha");
        String confirmacao = entrada.next();
        while (!senha.equals(confirmacao)) {

            System.out.println("Senha incorreta. Tente novamente: ");
            confirmacao = entrada.next();
        }
        System.out.println("Senha correta! Boas-vindas :)");
    }

}
