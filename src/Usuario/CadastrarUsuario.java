package Usuario;

import Objetos.ArmazenaDados;
//<<<<<<< HEAD
//
//import java.util.Scanner;
//
//public class  CadastrarUsuario extends ArmazenaDados {
//
//    public static void executar(Scanner scanner) {
//        System.out.println("Bem vindo!");
//        System.out.println("Digite seu nome: ");
//        String nome = scanner.next();
//        System.out.println("Informe o login: ");
//        String login = scanner.next();
//
//        String senha;
//        String confirmacao;
//        do {
//            System.out.println("Digite a senha: ");
//            senha = scanner.next();
//            System.out.println("Confirme a senha: ");
//            confirmacao = scanner.next();
//        } while (!senha.equals(confirmacao));
//
//        boolean valid = true;
//        do{
//            System.out.println("Escolha o bairro: ");
//            ArmazenaDados.imprimirBairros();
//            String entr = scanner.next();
//            if(!bairros.contains(entr)){
//                System.out.println("Bairro não encontrado");
//                valid = false;
//            } else {
//                bairros.indexOf(entr);
//            }
//        }while(valid);
//
//        System.out.println("Informe o telefone: ");
//        String tel = scanner.next();
//        System.out.println("Informe o endereço completo: ");
//        String ender = scanner.next();
//=======
import Objetos.Cliente;

import java.math.BigDecimal;
import java.util.Scanner;

public class CadastrarUsuario extends ArmazenaDados {

    public static void cadastrarCliente(){

        String login;

        int custoEntrega = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Crie um login de usuário:");
            login = scanner.nextLine();
            if (Cliente.findCliente(login) != null){
                System.out.println("Esse Login já existe, crie um login diferente");
            }else{
                break;
            }
        }while(true);

        System.out.println("Nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.println("Crie uma senha:");
        String senha = scanner.nextLine();
        System.out.println("Qual o endereço para entrega?");
        String endereco = scanner.nextLine();
        System.out.println("Digite um telefone de contato: ");
        String telefone = scanner.nextLine();

        boolean ciclo = true;

        do {

            System.out.println("No momento só entregamos para os bairros selecionados abaixo. Por favor indique o bairro de entrega. ");
            System.out.println("1 - Cidade industrial");
            System.out.println("2 - Fazendinha");
            System.out.println("3 - Portão");
            System.out.println("4 - Cristo Rei");
            System.out.println("5 - Batel");

            String action = scanner.nextLine();

            switch (action){
                case "1":
                    custoEntrega = 1;
                    ciclo = false;
                    break;
                case "2":
                    custoEntrega = 2;
                    ciclo = false;
                    break;
                case "3":
                    custoEntrega = 3;
                    ciclo = false;
                    break;
                case "4":
                    custoEntrega = 4;
                    ciclo = false;
                    break;
                case "5":
                    custoEntrega = 5;
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, por favor, informe outra");
            }

        }while(ciclo);

        Cliente cliente = new Cliente(nome, login, senha, endereco, custoEntrega, telefone);

        listaClientes.add(cliente);
    }
}
