package Utils;

import Objetos.ArmazenaDados;
import Objetos.Produto;

import java.math.BigDecimal;

public class UtilsExibirListas extends ArmazenaDados {

    public static void imprimirProdutos(Enum tipo){
        System.out.println();
        for (Produto produto: listaProdutos) {
            if (produto.getTipo().equals(tipo)){
                System.out.println("Número: " + listaProdutos.indexOf(produto) );
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Valor: R$ " + produto.getValor());
                System.out.println("--------------------------------------------");
            }
        }
    }

    public static void exibirTemp (){
        BigDecimal valorTotal = BigDecimal.valueOf(0);
        System.out.println();

        for (Produto produto: pedidosTemp) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("--------------------------------");

            valorTotal = valorTotal.add(produto.getValor());
        }

        System.out.println("Valor total do pedido: R$ " + valorTotal);
        System.out.println();
    }
}
