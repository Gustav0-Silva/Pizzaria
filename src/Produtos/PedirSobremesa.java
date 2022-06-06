package Produtos;

import Objetos.*;

import java.util.Scanner;

public class PedirSobremesa extends ArmazenaDados {
    public static void pedirSobremesa(){

        Scanner scanner = new Scanner(System.in);

        imprimirProdutos("sobremesa");
        System.out.println("Digite a sobremesa que deseja ou S para sair");
        String sabor = scanner.nextLine();

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        if (sabor.matches("[0-9]+")){
            for (Produto produto : listaProdutos) {
                if (produto instanceof Sobremesa) {
                    if (Integer.parseInt(sabor) == listaProdutos.indexOf(produto)) {
                        Sobremesa sobremesa = new Sobremesa(produto.getNome(), produto.getDescricao(), produto.getValor());
                        pedidosTemp.add(sobremesa);
                        System.out.println("Pedido adicionado com sucesso");
                        System.out.println();
                        return;
                    }
                }
            }
            System.out.println("Número informado não consta no menu, tente novamente");
            pedirSobremesa();

        }else {
            for (Produto produto : listaProdutos) {
                if (produto instanceof Sobremesa) {
                    if (produto.getNome().equalsIgnoreCase(sabor)) {
                        Sobremesa sobremesa = new Sobremesa(produto.getNome(), produto.getDescricao(), produto.getValor());
                        pedidosTemp.add(sobremesa);
                        System.out.println("Pedido adicionado com sucesso");
                        System.out.println();
                        return;
                    }
                }
            }
            System.out.println("Sabor informado não consta no menu, tente novamente");
            pedirSobremesa();
        }
    }
}
