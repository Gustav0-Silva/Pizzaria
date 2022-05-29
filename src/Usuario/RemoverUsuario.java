package Usuario;

import Objetos.ArmazenaDados;
import Objetos.Cliente;

import java.util.Scanner;

public class RemoverUsuario extends ArmazenaDados {

    public void removerUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o login do usuário a ser removido");
        String ususarioRemover = scanner.next();

        listaClientes.removeIf(cliente -> cliente.getLogin() == ususarioRemover);
    }
}
