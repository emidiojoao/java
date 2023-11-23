package aula09_metodos;

import java.util.Scanner;

public class metodos_login {

    public static void logar() {

        Scanner entrada = new Scanner(System.in);

        String usuarioBD = "admin";
        String senhaBD = "12345";

        String usuario;
        String senha;

        int opcao = 1;

        do {

            System.out.print("Informe o seu usuário: ");
            usuario = entrada.next();

            System.out.print("Informe a sua senha: ");
            senha = entrada.next();
            entrada.nextLine();
            System.out.println();
            
            if (usuario.equals(usuarioBD) && senha.equals(senhaBD)) {

                System.out.println("Conectado com sucesso!");
                opcao = 1;
                imprimirMenu();

            } else {

                System.out.println("Usuário ou senha incorreto!");
                System.out.println("Você gostaria de tentar novamente?");
                System.out.println();
                System.out.println("[1] - Sair");
                System.out.println("[2] - Tentar novamente");
                System.out.println();
                System.out.print("Escoha uma opção: ");
                opcao = entrada.nextInt();
                entrada.nextLine();
            }
        } while (opcao == 2);

    }
    
    public static int imprimirMenu() {
        
        Scanner entrada = new Scanner (System.in);
        int op;
        
        System.out.println("--------------------MENU--------------------");
        System.out.println("""
                           [1] Inserir Produto 
                           [2] Atualizar Produto
                           [3] Excluir Produto 
                           [4] Exibir Produto
                           [5] Imprimir Ordem 
                           [6] Imprimir Classificação
                           [7] Adicionar Estoque
                           [8] Remover Estoque 
                           [9] Painel de Compras 
                           [0] Encerrar Programa 
                                                      """);
        System.out.println("--------------------------------------------");
        
        op = entrada.nextInt();
        return op;
    }

    public static void main(String[] args) {

        logar();
    }
}
