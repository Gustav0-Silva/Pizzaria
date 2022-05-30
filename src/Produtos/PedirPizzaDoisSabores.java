package Produtos;

import Objetos.Pedido;
import Objetos.Pizza;

import java.math.BigDecimal;
import java.util.Scanner;

public class PedirPizzaDoisSabores extends PedirPizza {

    public static void executar(Scanner sc) {

        String sabores = null;
        BigDecimal valores = BigDecimal.valueOf(0);

        CadastrarPizza.imprimir();
        System.out.println("Digite o número da primeira pizza que deseja adicionar ou s para sair");
        String sabor = sc.nextLine();
        String saborAdicionar = null;
        String esp = " e ";
        BigDecimal valor = BigDecimal.valueOf(0);
        BigDecimal pizzaValor1 = BigDecimal.valueOf(0);
        BigDecimal pizzaValor2 = BigDecimal.valueOf(0);

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        for (Pizza pizza : listaPizzas) {
            if (pizza.getNome().equalsIgnoreCase(sabor)) {
                saborAdicionar = sabor;
                pizzaValor1 = pizza.getValor();
            }
        }

        System.out.println("Digite o número da segunda pizza que deseja adicionar");
        sabor = sc.nextLine();

        for (Pizza pizza : listaPizzas) {
            if (pizza.getNome().equalsIgnoreCase(sabor)) {
               saborAdicionar = saborAdicionar + esp + sabor;
               pizzaValor2 = pizza.getValor();
            }
        }

        if (pizzaValor1.compareTo(pizzaValor2) == 1){
            valor = pizzaValor1;
        }else {
            valor = pizzaValor2;
        }

        Pedido pedido = new Pedido(saborAdicionar, valor);
        pedidosTemp.add(pedido);
    }

}

