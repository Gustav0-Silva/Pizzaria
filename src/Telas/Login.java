package Telas;
import Objetos.Cliente;
import ActionUsuario.CadastrarUsuario;
import ActionUsuario.FazerPedido;
import Utils.UtilsConfirmaSeExiste;

import java.util.Scanner;

public class Login{

    public void loginClinete(){
        Administrador adm = new Administrador();
        CadastrarUsuario cad = new CadastrarUsuario();
        Scanner scanner = new Scanner(System.in);
        String senha;

        System.out.println("Digite o login do cliente");
        String login = scanner.nextLine();

        if (login.equals("Admin")){
            senha = scanner.nextLine();
            if (senha.equals("Admin")){
                adm.executar(scanner);
                return;
            }
            return;
        }

        Cliente cliente = UtilsConfirmaSeExiste.clienteExiste(login);

        if(cliente == null){
            System.out.println("Login não encontrado, criar uma nova conta?(sim/não)");
            String criarNovaConta = scanner.nextLine();

            if (criarNovaConta.equalsIgnoreCase("sim")){
                cad.cadastrarCliente();
            }

        }else {
            do {
                System.out.println("Digite a senha: ");
                senha = scanner.nextLine();

                if (cliente.getSenha().equals(senha)) {
                    FazerPedido ped = new FazerPedido();
                    ped.fazerPedido(senha);
                    break;
                } else {
                    System.out.println("Senha errada, digite novamente a senha");
                }
            }while (true);
        }
    }
}
