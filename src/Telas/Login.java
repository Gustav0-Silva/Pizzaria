package Telas;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Objetos.Pedido;
import Produtos.PedirPizza;
import Usuario.CadastrarUsuario;
import Usuario.FazerPedido;

import java.util.Scanner;

public class Login extends ArmazenaDados {

    public static void loginClinete(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o login do cliente");
        String novoLogin = scanner.nextLine();

        if(Cliente.findCliente(novoLogin) == null){
            System.out.println("Login não encontrado, criar uma nova conta?(sim/não)");
            String criarNovaConta = scanner.nextLine();
            if (criarNovaConta.equalsIgnoreCase("sim")){
                CadastrarUsuario cadastrarUsuario;
            }else{
                return;
            }

        }else {

            do {
                System.out.println("Digite a senha");
                String novaSenha = scanner.nextLine();

                if ((novaSenha.equals(Cliente.findCliente(novoLogin).getSenha()))) {
                    FazerPedido.fazerPedido();
                    break;
                } else {
                    System.out.println("Senha errada, digite novamente a senha");
                }
            }while (true);
        }

    }

}
