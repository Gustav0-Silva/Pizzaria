package Produtos;

import Objetos.*;

import java.util.Scanner;

public class PedirBebida extends ArmazenaDados {

    public static void pedirBebida(){

        Scanner scanner = new Scanner(System.in);

            imprimirProdutos("bebida");
            System.out.println("Digite a bebida que deseja ou digite s para sair");
            String sabor = scanner.nextLine();

            if (sabor.equalsIgnoreCase("s")){
                return;
            }

        if (sabor.matches("[0-9]+")){
            for (Produto produto : listaProdutos) {
                if (produto instanceof Bebida) {
                    if (Integer.parseInt(sabor) == listaProdutos.indexOf(produto)) {
                        Bebida bebida = new Bebida(produto.getNome(), produto.getDescricao(), produto.getValor());
                        pedidosTemp.add(bebida);
                        System.out.println("Pedido adicionado com sucesso");
                        System.out.println();
                        return;
                    }
                }
            }
            System.out.println("Número informado não consta no menu, tente novamente");
            pedirBebida();

        }else {
            for (Produto produto : listaProdutos) {
                if (produto instanceof Bebida) {
                    if (produto.getNome().equalsIgnoreCase(sabor)) {
                        Bebida bebida = new Bebida(produto.getNome(), produto.getDescricao(), produto.getValor());
                        pedidosTemp.add(bebida);
                        System.out.println("Pedido adicionado com sucesso");
                        System.out.println();
                        return;
                    }
                }
            }
            System.out.println("Sabor informado não consta no menu, tente novamente");
            pedirBebida();
        }
    }
}
