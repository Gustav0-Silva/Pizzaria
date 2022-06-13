import Objetos.ArmazenaDados;
import ActionAdm.CadastrarExemplos;
import Telas.Login;
import ActionUsuario.CadastrarUsuario;

import java.util.Scanner;

public class Main extends ArmazenaDados{
    public static void main(String[] args) {

       CadastrarExemplos.cadastrarExemplos();

        boolean ciclo = true;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Bem vindo a Masters Pizzaria");
            System.out.println("O que deseja fazer hoje?");
            System.out.println();
            System.out.println("1 - Fazer um pedido");
            System.out.println("2 - Cadastrar novo cliente");
            System.out.println("3 - Sair do sistema");

            String action = scanner.nextLine();

            switch (action){
                case "1":
                    Login login = new Login();
                    login.loginClinete();
                    break;
                case "2":
                    CadastrarUsuario cad = new CadastrarUsuario();
                    cad.cadastrarCliente();
                    break;
                case "3":
                    System.out.println("Obrigado e volte sempre!");
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, por favor, informe outra");
            }

        }while(ciclo);

    }
}