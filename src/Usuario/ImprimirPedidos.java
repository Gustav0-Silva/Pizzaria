package Usuario;

import Objetos.ArmazenaDados;
import Objetos.Pedido;
import Objetos.Produto;

import java.math.BigDecimal;

public class ImprimirPedidos extends ArmazenaDados {

    public static void imprimirPedidos(){
        BigDecimal valorTotal = BigDecimal.ZERO;

        for ( Produto produto : pedidosTemp) {

            valorTotal = valorTotal.add(produto.getValor());

            System.out.println("Produto:"+ produto.getNome() +
                    " Valor: "+ produto.getValor());

        }
        System.out.println("O valor total da compra é " + valorTotal);

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




