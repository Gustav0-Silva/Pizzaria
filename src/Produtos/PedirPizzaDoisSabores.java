package Produtos;

import Objetos.Pedido;
import Objetos.Pizza;
import Objetos.Produto;

import java.math.BigDecimal;
import java.util.Scanner;

public class PedirPizzaDoisSabores extends PedirPizza {

    public static void executar(Scanner sc) {

        imprimirProdutos("pizza");
        System.out.println("Digite o nome ou número da primeira pizza que deseja adicionar ou S para sair");
        String sabor = sc.nextLine();
        String saborAdicionar = null;
        String esp = " e ";
        int flag = 0;
        BigDecimal valor = BigDecimal.valueOf(0);
        BigDecimal pizzaValor1 = BigDecimal.valueOf(0);
        BigDecimal pizzaValor2 = BigDecimal.valueOf(0);

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        if (sabor.matches("[0-9]+")){
            for (Produto produto : listaProdutos) {
                if (produto instanceof Pizza) {
                    if (Integer.parseInt(sabor) == listaProdutos.indexOf(produto)) {
                        System.out.println("Primeiro sabor adicionado com sucesso");
                        System.out.println();
                        pizzaValor1 = produto.getValor();
                        flag = 1;
                        sabor = produto.getNome();
                        break;
                    }
                }
            }
        }else {
            for (Produto produto : listaProdutos) {
                if (produto instanceof Pizza) {
                    if (produto.getNome().equals(sabor)) {
                        System.out.println("Primeiro sabor adicionado com sucesso");
                        System.out.println();
                        pizzaValor1 = produto.getValor();
                        flag = 1;
                        sabor = produto.getNome();
                        break;
                    }
                }
            }
        }

        if (flag ==0){
            System.out.println("Pedido informado não está no menu, tente novamente");
            executar(sc);
            System.out.println();
        }

        flag = 0;

        System.out.println("Digite o nome ou número da segunda pizza que deseja adicionar ou S para sair");
        saborAdicionar = sc.nextLine();

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        if (saborAdicionar.matches("[0-9]+")){
            for (Produto produto : listaProdutos) {
                if (produto instanceof Pizza) {
                    if (Integer.parseInt(saborAdicionar) == listaProdutos.indexOf(produto)) {
                        pizzaValor2 = produto.getValor();
                        System.out.println("Pedido adicionado com sucesso");
                        System.out.println();
                        flag = 1;
                        saborAdicionar = produto.getNome();
                        sabor = sabor + esp + saborAdicionar;
                        break;
                    }
                }
            }
        }else {
            for (Produto produto : listaProdutos) {
                if (produto instanceof Pizza) {
                    if (produto.getNome().equals(saborAdicionar)) {
                        pizzaValor2 = produto.getValor();
                        System.out.println("Pedido adicionado com sucesso");
                        System.out.println();
                        flag = 1;
                        saborAdicionar = produto.getNome();
                        sabor = sabor + esp + saborAdicionar;
                        break;
                    }
                }
            }
        }

        if (flag ==0){
            System.out.println("Pedido informado não está no menu, tente novamente");
            executar(sc);
            System.out.println();
        }

        if (pizzaValor1.compareTo(pizzaValor2) == 1){
            valor = pizzaValor1;
        }else {
            valor = pizzaValor2;
        }

        Pizza pizza = new Pizza(sabor,"Pizza de dois sabores",valor);
        pedidosTemp.add(pizza);
    }

}

