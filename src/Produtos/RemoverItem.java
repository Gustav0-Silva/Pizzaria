package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Pedido;
import Usuario.ImprimirPedidos;

import java.util.Scanner;

public class RemoverItem extends ArmazenaDados {

    public static void removerItem(Scanner scanner){

        if (pedidosTemp.equals(null) || pedidosTemp.isEmpty()){
            System.out.println("Ainda não foram adicionados itens ao pedido");
            System.out.println();
            return;
        }

        System.out.println();
        ImprimirPedidos.exibirTemp();
        System.out.println();
        System.out.println("Por favor, digite o nome do item que deseja remover: ");
        String remover = scanner.nextLine();

        for (Pedido pedido: pedidosTemp) {
            if (remover.equalsIgnoreCase(pedido.getNomeProduto())){
                pedidosTemp.remove(pedido);
                System.out.println("Item removido com sucesso");
                System.out.println();
                return;
            }
        }

        System.out.println("Desculpe, item não corresponde aos seus pedidos, o que deseja fazer?");
        System.out.println("1 - Tentar novamente");
        System.out.println("2 - Sair");

        String action = scanner.nextLine();

        if (action.equals("1")){
            removerItem(scanner);
        } else if (action.equals("2")) {
            return;
        } else {
            System.out.println();
            System.out.println("Opção digitada inválida, redirecionando para menu principal");
            System.out.println();
        }
    }
}
