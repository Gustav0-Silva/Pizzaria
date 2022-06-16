package ActionUsuario;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Utils.UtilsConfirmaSeExiste;
import java.util.Scanner;

public class CadastrarUsuario extends ArmazenaDados {

    public void cadastrarCliente(){

        String login;

        int custoEntrega = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Crie um login de usuário:");
            login = scanner.nextLine();
            if (UtilsConfirmaSeExiste.clienteExiste(login) != null){
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

            if (action.matches("[1-5]")){
                custoEntrega = Integer.parseInt(action);
                ciclo = false;
            }else {
                System.out.println("Bairro inválido, por favor, tente novamente");
            }
        }while(ciclo);

        Cliente cliente = new Cliente(nome, login, senha, endereco, custoEntrega, telefone);
        logins.put(cliente.getLogin(), cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }
}
