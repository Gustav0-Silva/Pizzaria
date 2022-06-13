package ActionUsuario;

import Objetos.ArmazenaDados;
import Objetos.Produto;
import Utils.UtilsExibirListas;

import java.util.Scanner;

public class RemoverItem extends ArmazenaDados {

    public static void removerItem(Scanner scanner){

        if (pedidosTemp.isEmpty()){
            System.out.println("Ainda não foram adicionados itens ao pedido");
            System.out.println();
            return;
        }

        System.out.println();
        UtilsExibirListas.exibirTemp();
        System.out.println();
        System.out.println("Por favor, digite o nome do item que deseja remover: ");
        String remover = scanner.nextLine();

        for (Produto produto: pedidosTemp) {
            if (remover.equalsIgnoreCase(produto.getNome())){
                pedidosTemp.remove(produto);
                System.out.println("Item removido com sucesso");
                System.out.println();
                return;
            }
        }

        System.out.println("Desculpe, item não corresponde aos seus pedidos, o que deseja fazer?");
        System.out.println("1 - Tentar novamente");
        System.out.println("2 - Sair");

        String action = scanner.nextLine();

        switch (action){
            case "1":
                removerItem(scanner);
                break;
            case "2":
                System.out.println();
                System.out.println("Operação cancelada...");
                System.out.println();
                break;
            default:
                System.out.println();
                System.out.println("Opção digitada inválida, redirecionando para menu principal");
                System.out.println();
        }
    }
}
