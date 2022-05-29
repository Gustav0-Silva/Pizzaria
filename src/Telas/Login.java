package Telas;

import Objetos.ArmazenaDados;
import Objetos.Pedido;
import Usuario.CadastrarUsuario;

import java.util.Scanner;

public class Login extends ArmazenaDados {

    public void loginClinete(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o login do cliente");
        String novoLogin = scanner.next();

        if(!listaClientes.contains(novoLogin)){
            System.out.println("Login não encontrado, criar uma nova conta?(sim/não)");
            String criarNovaConta = scanner.next();
            if (criarNovaConta.equalsIgnoreCase("sim")){
                CadastrarUsuario cadastrarUsuario;
            }else{
                return;
            }

        }else {
            do {
                System.out.println("Digite a senha");
                String novaSenha = scanner.next();
                if ((novaSenha.equals(listaClientes.contains(novaSenha)))) {
                    Pedido pedido;
                    break;
                } else {
                    System.out.println("Senha errada, digite novamente a senha");
                }
            }while (true);
        }

    }

}
