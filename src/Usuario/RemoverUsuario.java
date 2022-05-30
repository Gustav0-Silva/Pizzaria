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

        for (Cliente cliente: listaClientes) {
            if (cliente.getLogin().equals(ususarioRemover) && cliente.getSenha().equals(senha)){
                listaClientes.remove(cliente);
                System.out.println("Cliente removido com sucesso");
                System.out.println();
                return;
            }
        }
        System.out.println("Cliente não encontrado no banco de dados");
    }
}
