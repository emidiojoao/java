
package aula09_metodos;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Metodo_Login {

    public static void login() {
        
        Scanner keyboard = new Scanner (System.in);
        
        String usernameDataBase = "admin";
        String passwordDataBase = "123456";
        
        String username;
        String password;
        
        int option = 1;       
        
        
        do {
            
            System.out.print("Informe seu usuário: ");
            username = keyboard.nextLine();
            
            System.out.print("Informe sua senha: ");
            password = keyboard.nextLine();
            keyboard.nextLine();
            
            
            if(username.equals(usernameDataBase) && password.equals(passwordDataBase)) {
                
                System.out.println("You're logged!");
                option = 1;
                
            } else {
                
                System.out.println("[ERROR] Usuário ou senha incorreto!");
                System.out.println(" Você gostaria de tentar novamente? ");
                System.out.println("[1] Sair ");
                System.out.println("[2] Tentar Novamente");
                option = keyboard.nextInt();
                keyboard.nextLine(); 
            }
            
        } while(option == 2);
            
        
        
    }
              
    


    public static void main(String[] args) {
        
       login();   
             
        
        
    }
    
}