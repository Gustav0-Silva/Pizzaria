package Produtos;

import Objetos.*;
import Usuario.FazerPedido;

import java.math.BigDecimal;
import java.util.Scanner;

public class PedirPizza extends ArmazenaDados {
    public static void pedirPizza() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gostaria de pedir pizza de dois sabores?");
        System.out.println("1 - 1 Sabor");
        System.out.println("2 - 2 Sabores");
        String action = scanner.nextLine();

        switch (action){
            case "2":
                PedirPizzaDoisSabores.executar(scanner);
                return;
            case"1":
                break;
            default:
                break;
        }


        imprimirProdutos(TiposProdutos.PIZZA);
        System.out.println("Digite o nome da pizza que deseja ou s para sair");
        String sabor = scanner.nextLine();

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        Produto produto = pedidoExiste(TiposProdutos.PIZZA);

        if (produto.equals(null)){
            System.out.println("Produto não existe");
            return;
        } else {
            Pedido pedido = new Pedido(produto);
            pedidosTemp.add(pedido);
            return;
        }
    }
}

