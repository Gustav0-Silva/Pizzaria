package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Objetos.Pedido;
import Objetos.Pizza;
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

        String sabores = null;
        BigDecimal valores = BigDecimal.valueOf(0);

            CadastrarPizza.imprimir();
            System.out.println("Digite o número da pizza que deseja ou s para sair");
            String sabor = scanner.nextLine();

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        for (Pizza pizza : listaPizzas) {
                if (pizza.getNome().equalsIgnoreCase(sabor)) {
                    Pedido pedido = new Pedido(pizza.getNome(), pizza.getValor());
                    pedidosTemp.add(pedido);
                }
            }
        }
    }
//}
