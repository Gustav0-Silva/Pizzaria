package Usuario;

import Objetos.ArmazenaDados;
import Objetos.Cliente;

import java.util.Scanner;

public class RemoverUsuario extends ArmazenaDados {

    public static void removerUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o login do usuário a ser removido");
        String ususarioRemover = scanner.next();
        System.out.println("Digite a senha do usuário: ");
        String senha = scanner.next();

        if (listaClientes.contains(ususarioRemover) && listaClientes.contains(senha)){

            listaClientes.removeIf(cliente -> cliente.getLogin() == ususarioRemover);
        }else{
            System.out.println("Usuário ou senha não encontrado");
            return;
        }
    }
}
