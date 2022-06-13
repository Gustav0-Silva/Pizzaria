package Factory;

import Objetos.ArmazenaDados;
import Objetos.Produto;
import Objetos.TipoProduto;
import Utils.UtilsExibirListas;

import java.math.BigDecimal;
import java.util.Scanner;

public class FactoryPizzaDoisSabores extends ArmazenaDados {

    public void gerarPedidoDoisSabores(Scanner sc, Enum tipo){
        BigDecimal valor = BigDecimal.valueOf(0);
        String sabor2;
        String sabor1;
        String sabor;
        String esp = " e ";

        UtilsExibirListas.imprimirProdutos(tipo);

        System.out.println("Digite o primeiro sabor que deseja ou digite S para sair");
        sabor1 = sc.nextLine();

        if (sabor1.equalsIgnoreCase("s")){
            return;
        }

        //Conferindo se primeira pizza existe
        Produto produto1 = addPedidoDoisSabores(sabor1,tipo);
        if (produto1.equals(null)){
            retornoNulo();
            return;
        }

        System.out.println("Digite o segundo sabor que deseja ou digite S para sair");
        sabor2 = sc.nextLine();

        if (sabor2.equalsIgnoreCase("s")){
            return;
        }

        //Conferindo se segunda pizza existe
        Produto produto2 = addPedidoDoisSabores(sabor2,tipo);
        if (produto2.equals(null)){
            retornoNulo();
            return;
        }

        //comparando valor maior
        if (produto1.getValor().compareTo(produto2.getValor()) >= 0){
            valor = produto1.getValor();
        }else {
            valor = produto2.getValor();
        }

        //concatenando nomes
        sabor = produto1.getNome() + esp + produto2.getNome();

        Produto produto = new Produto(sabor,"Pizza de dois sabores", valor, TipoProduto.PIZZA);
        pedidosTemp.add(produto);
    }

    private Produto addPedidoDoisSabores(String sabor, Enum tipo){
        if (sabor.matches("[0-9]+")){
            for (Produto produto: listaProdutos) {
                if (produto.getTipo().equals(tipo) && listaProdutos.indexOf(produto) == Integer.parseInt(sabor)){
                    System.out.println("Produto adicionado com sucesso!");
                    return produto;
                }
            }
        }else {
            for (Produto produto: listaProdutos) {
                if (produto.getTipo().equals(tipo) && produto.getNome().equals(sabor)){
                    System.out.println("Produto adicionado com sucesso!");
                    return produto;
                }
            }
        }
        return null;
    }

    private void retornoNulo(){
        System.out.println("Produto não encontrado, você será redirecionado para o menu de pedidos");
        System.out.println();
    }
}
