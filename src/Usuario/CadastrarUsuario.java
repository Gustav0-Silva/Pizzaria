package Usuario;

import Objetos.ArmazenaDados;

import java.util.Scanner;

public class  CadastrarUsuario extends ArmazenaDados {

    public static void executar(Scanner scanner) {
        System.out.println("Bem vindo!");
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Informe o login: ");
        String login = scanner.next();

        String senha;
        String confirmacao;
        do {
            System.out.println("Digite a senha: ");
            senha = scanner.next();
            System.out.println("Confirme a senha: ");
            confirmacao = scanner.next();
        } while (!senha.equals(confirmacao));

        boolean valid = true;
        do{
            System.out.println("Escolha o bairro: ");
            ArmazenaDados.imprimirBairros();
            String entr = scanner.next();
            if(!bairros.contains(entr)){
                System.out.println("Bairro não encontrado");
                valid = false;
            } else {
                bairros.indexOf(entr);
            }
        }while(valid);

        System.out.println("Informe o telefone: ");
        String tel = scanner.next();
        System.out.println("Informe o endereço completo: ");
        String ender = scanner.next();
    }
}
