import Objetos.ArmazenaDados;
//import Produtos.CadastrarExemplos;
import Telas.Login;
import Usuario.CadastrarUsuario;
import Usuario.RemoverUsuario;

import java.util.Scanner;

public class Main extends ArmazenaDados{
    public static void main(String[] args) {

//        CadastrarExemplos.cadastrarExemplos();

        boolean ciclo = true;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Bem vindo a Masters Pizzaria");
            System.out.println("O que deseja fazer hoje?");
            System.out.println();
            System.out.println("1 - Pedir uma pizza");
            System.out.println("2 - Cadastrar novo cliente");
            System.out.println("3 - Remover usuário");
            System.out.println("4 - Sair do sistema");

            String action = scanner.nextLine();

            switch (action){
                case "1":
                    Login.loginClinete();
                    break;
                case "2":
                    CadastrarUsuario.cadastrarCliente();
                    break;
                case "3":
                    RemoverUsuario.removerUsuario();
                    break;
                case "4":
                    System.out.println("Obrigado e volte sempre!");
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, por favor, informe outra");
            }

        }while(ciclo);

    }
}