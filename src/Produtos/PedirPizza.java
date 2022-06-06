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
        System.out.println("3 - Sair");
        String action = scanner.nextLine();

        switch (action) {
            case "2":
                PedirPizzaDoisSabores.executar(scanner);
                return;
            case "1":
                break;
            case "3":
                return;
            default:
                System.out.println("Item inválido, tente novamente");
                pedirPizza();
                break;
        }


        imprimirProdutos("pizza");
        System.out.println();
        System.out.println("Digite o nome da pizza que deseja ou S para sair");
        String sabor = scanner.nextLine();

        if (sabor.equalsIgnoreCase("s")) {
            return;
        }

        if (sabor.matches("[0-9]+")) {
            for (Produto produto : listaProdutos) {
                if (produto instanceof Pizza) {
                    if (Integer.parseInt(sabor) == listaProdutos.indexOf(produto)) {
                        Pizza pizza = new Pizza(produto.getNome(), produto.getDescricao(), produto.getValor());
                        pedidosTemp.add(pizza);
                        System.out.println("Pedido adicionado com sucesso");
                        System.out.println();
                        return;
                    }
                }
            }
            System.out.println("Número informado não consta no menu, tente novamente");
            pedirPizza();
        } else {
            for (Produto produto : listaProdutos) {
                if (produto instanceof Pizza) {
                    if (produto.getNome().equalsIgnoreCase(sabor)) {
                        Pizza pizza = new Pizza(produto.getNome(), produto.getDescricao(), produto.getValor());
                        pedidosTemp.add(pizza);
                        System.out.println("Pedido adicionado com sucesso");
                        System.out.println();
                        return;
                    }
                }
            }
            System.out.println("Sabor informado não consta no menu, tente novamente");
            pedirPizza();
        }
    }
}

